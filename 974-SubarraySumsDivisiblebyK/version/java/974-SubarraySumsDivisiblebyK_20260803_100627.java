// Last updated: 8/3/2026, 10:06:27 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, 1);
5        int sum = 0;
6        int count = 0;
7        for (int num : nums) {
8            sum += num;
9            int rem = ((sum % k) + k) % k;
10            if (map.containsKey(rem)) {
11                count += map.get(rem);
12            }
13            map.put(rem, map.getOrDefault(rem, 0) + 1);
14        }
15        return count;
16    }
17}