// Last updated: 8/3/2026, 11:05:47 AM
1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0;
5        for (int i = 0; i < n; i++) {
6            for (int j = i + 1; j < n; j++) {
7                if (nums[i] == nums[j] && (i * j) % k == 0) {
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14}