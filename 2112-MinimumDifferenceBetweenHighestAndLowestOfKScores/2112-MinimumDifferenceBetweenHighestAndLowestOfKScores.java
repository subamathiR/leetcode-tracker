// Last updated: 7/9/2026, 9:49:28 AM
 class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE, j = k - 1;
        for(int i = 0; i + j < nums.length; i++) {
            ans = Math.min(ans, nums[i + j] - nums[i]);
        }
        return ans;
    }
}