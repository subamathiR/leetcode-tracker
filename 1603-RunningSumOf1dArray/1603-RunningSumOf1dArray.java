// Last updated: 7/9/2026, 9:50:48 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        return prefix;
    }
}