// Last updated: 7/9/2026, 9:47:29 AM
 class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int[] hash = new int[51];
        int ans = 0, sum = 0;
        for(int i = 0; i < apple.length; i++) sum += apple[i];
        for(int i = 0; i < capacity.length; i++) hash[capacity[i]]++;
        for(int i = 50; i > 0; i--) {
            while(hash[i] > 0) {
                sum -= i;
                hash[i]--;
                ans++;
                if(sum <= 0) return ans;
            }
        }
        return ans;
    }
}