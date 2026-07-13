// Last updated: 7/13/2026, 11:36:58 AM
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long ans = 0;
4        long count = 0;
5
6        for (int i=0;i<nums.length;i++) {
7            if (nums[i] == 0) {
8                count++;
9                ans += count;
10            } else {
11                count = 0;
12            }
13        }
14
15        return ans;
16    }
17}