// Last updated: 9/3/2026, 12:22:29 PM
1class Solution {
2    public boolean isMiddleElementUnique(int[] nums) {
3        int n = nums.length;
4        int middle = n / 2;
5        for (int i = 0; i < n; i++) {
6            if (i != middle && nums[i] == nums[middle]) {
7                return false;
8            }
9        }
10        return true;
11    }
12}