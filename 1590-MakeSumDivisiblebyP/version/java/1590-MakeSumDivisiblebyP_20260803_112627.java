// Last updated: 8/3/2026, 11:26:27 AM
1import java.util.*;
2class Solution {
3    public int minAbsoluteDifference(List<Integer> nums, int x) {
4        int n = nums.size();
5        if (x == 0)
6            return 0;
7        TreeSet<Integer> set = new TreeSet<>();
8        int ans = Integer.MAX_VALUE;
9        for (int i = x; i < n; i++) {
10            set.add(nums.get(i - x));
11            int curr = nums.get(i);
12            Integer floor = set.floor(curr);
13            if (floor != null) {
14                ans = Math.min(ans, curr - floor);
15            }
16            Integer ceil = set.ceiling(curr);
17            if (ceil != null) {
18                ans = Math.min(ans, ceil - curr);
19            }
20        }
21        return ans;
22    }
23}