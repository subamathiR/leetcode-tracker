// Last updated: 8/4/2026, 12:14:25 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5        int min = nums[0];
6        int max = nums[0];
7        for (int num : nums) {
8            set.add(num);
9            if (num < min)
10                min = num;
11            if (num > max)
12                max = num;
13        }
14        for (int i = min; i <= max; i++) {
15            if (!set.contains(i)) {
16                ans.add(i);
17            }
18        }
19        return ans;
20    }
21}