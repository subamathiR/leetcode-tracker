// Last updated: 8/18/2026, 1:55:12 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4        int[] freq = new int[51];
5        for (int num : nums) {
6            freq[num]++;
7        }
8        if (k == n) {
9            int ans = -1;
10            for (int num : nums) {
11                ans = Math.max(ans, num);
12            }
13            return ans;
14        }
15        if (k == 1) {
16            int ans = -1;
17            for (int num : nums) {
18                if (freq[num] == 1) {
19                    ans = Math.max(ans, num);
20                }
21            }
22            return ans;
23        }
24        int ans = -1;
25        if (freq[nums[0]] == 1) {
26            ans = Math.max(ans, nums[0]);
27        }
28        if (freq[nums[n - 1]] == 1) {
29            ans = Math.max(ans, nums[n - 1]);
30        }
31        return ans;
32    }
33}