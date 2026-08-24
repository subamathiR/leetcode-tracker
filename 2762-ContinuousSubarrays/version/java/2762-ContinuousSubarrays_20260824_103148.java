// Last updated: 8/24/2026, 10:31:48 AM
1import java.util.*;
2class Solution {
3    public long continuousSubarrays(int[] nums) {
4        int left = 0;
5        long count = 0;
6        TreeMap<Integer, Integer> map = new TreeMap<>();
7        for (int right = 0; right < nums.length; right++) {
8            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
9            while (map.lastKey() - map.firstKey() > 2) {
10                int value = nums[left];
11                map.put(value, map.get(value) - 1);
12                if (map.get(value) == 0) {
13                    map.remove(value);
14                }
15                left++;
16            }
17            count += right - left + 1;
18        }
19        return count;
20    }
21}