// Last updated: 8/3/2026, 10:26:53 AM
1class Solution {
2    public long countBadPairs(int[] nums) {
3        int n = nums.length;
4        long totalPairs = (long) n * (n - 1) / 2;
5        long goodPairs = 0;
6        HashMap<Integer, Integer> map = new HashMap<>();
7        for (int i = 0; i < n; i++) {
8            int key = nums[i] - i;
9            if (map.containsKey(key)) {
10                goodPairs += map.get(key);
11            }
12            map.put(key, map.getOrDefault(key, 0) + 1);
13        }
14        return totalPairs - goodPairs;
15    }
16}