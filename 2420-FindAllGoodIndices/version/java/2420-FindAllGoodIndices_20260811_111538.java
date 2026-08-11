// Last updated: 8/11/2026, 11:15:38 AM
1class Solution {
2    public List<Integer> goodIndices(int[] nums, int k) {
3        int n = nums.length;
4        int[] left = new int[n];
5        int[] right = new int[n];
6        left[0] = 1;
7        for (int i = 1; i < n; i++) {
8            if (nums[i - 1] >= nums[i]) {
9                left[i] = left[i - 1] + 1;
10            } else {
11                left[i] = 1;
12            }
13        }
14        right[n - 1] = 1;
15        for (int i = n - 2; i >= 0; i--) {
16            if (nums[i] <= nums[i + 1]) {
17                right[i] = right[i + 1] + 1;
18            } else {
19                right[i] = 1;
20            }
21        }
22        List<Integer> result = new ArrayList<>();
23        for (int i = k; i < n - k; i++) {
24            if (left[i - 1] >= k &&
25                right[i + 1] >= k) {
26                result.add(i);
27            }
28        }
29        return result;
30    }
31}