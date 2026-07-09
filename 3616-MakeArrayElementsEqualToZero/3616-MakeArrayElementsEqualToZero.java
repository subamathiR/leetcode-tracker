// Last updated: 7/9/2026, 9:46:45 AM
class Solution {
    public int countValidSelections(int[] nums) {
        int prefix=0, cnt=0, sum=0;
        for(int x : nums) sum+=x;
        for(int x : nums){
            prefix+=x;
            if (x==0){
                final int move=Math.max(2-Math.abs(2*prefix-sum), 0);
                cnt+=move;
            }
        }
        return cnt;
    }
}
