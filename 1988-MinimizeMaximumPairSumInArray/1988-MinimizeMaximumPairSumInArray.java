// Last updated: 7/9/2026, 9:49:53 AM
class Solution {
    public int minPairSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] freq = new int[100001];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min)
            min = nums[i];
            if(nums[i] > max)
            max = nums[i];
            freq[nums[i]]++;
        }
        int l = min;
        int r = max;
        int maxsum = 0;
        while(l <= r){
            if(freq[l] == 0)
            l++;
            else if(freq[r] == 0)
            r--;
            else{
                maxsum = Math.max(maxsum, l + r);
                freq[l]--;
                freq[r]--;
            }
        }
        return maxsum;
    }
}