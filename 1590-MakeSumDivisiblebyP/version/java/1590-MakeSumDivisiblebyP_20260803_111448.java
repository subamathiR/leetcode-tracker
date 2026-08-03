// Last updated: 8/3/2026, 11:14:48 AM
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        HashSet<String> set = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            for (int j = i + 1; j < nums.length; j++) {
6                if (Math.abs(nums[i] - nums[j]) == k) {
7                    int a = Math.min(nums[i], nums[j]);
8                    int b = Math.max(nums[i], nums[j]);
9                    set.add(a + "," + b);
10                }
11            }
12        }
13        return set.size();
14    }
15}