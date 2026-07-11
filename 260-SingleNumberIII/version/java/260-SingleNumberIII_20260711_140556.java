// Last updated: 7/11/2026, 2:05:56 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        int[] ans = new int[2];
8        int index = 0;
9        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
10            if (entry.getValue() == 1) {
11                ans[index++] = entry.getKey();
12            }
13        }
14        return ans;
15    }
16}