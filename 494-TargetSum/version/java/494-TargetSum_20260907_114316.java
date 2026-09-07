// Last updated: 9/7/2026, 11:43:16 AM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return solve(nums, 0, 0, target);
4    }
5    public int solve(int[] nums, int index, int sum, int target) {
6        if (index == nums.length) {
7            if (sum == target) {
8                return 1;
9            }
10            return 0;
11        }
12        int add = solve(nums, index + 1, sum + nums[index], target);
13        int subtract = solve(nums, index + 1, sum - nums[index], target);
14        return add + subtract;
15    }
16}