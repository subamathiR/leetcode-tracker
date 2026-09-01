// Last updated: 9/1/2026, 10:31:48 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int i = 0; i < nums.length; i++) {
5            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
6        }
7        int[] r = new int[k];
8        for (int x = 0; x < k; x++) {
9            int maxfreq = 0;
10            int maxelement = 0;
11            for (int num : map.keySet()) {
12                if (map.get(num) > maxfreq) {
13                    maxfreq = map.get(num);
14                    maxelement = num;
15                }
16            }
17            r[x] = maxelement;
18            map.remove(maxelement);
19        }
20        return r;
21    }
22}