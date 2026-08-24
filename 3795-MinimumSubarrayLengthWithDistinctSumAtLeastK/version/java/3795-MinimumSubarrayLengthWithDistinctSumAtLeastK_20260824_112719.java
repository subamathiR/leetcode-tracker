// Last updated: 8/24/2026, 11:27:19 AM
1class Solution {
2    public int minLength(int[] nums, int k) {
3        int l = 0;
4        long sum = 0;
5        int min = Integer.MAX_VALUE;
6        int[] freq = new int[100001];
7        for (int r = 0; r < nums.length; r++) {
8            if (freq[nums[r]] == 0) {
9                sum += nums[r];
10            }
11            freq[nums[r]]++;
12            while (sum >= k) {
13                min = Math.min(min, r - l + 1);
14                freq[nums[l]]--;
15                if (freq[nums[l]] == 0) {
16                    sum -= nums[l];
17                }
18                l++;
19            }
20        }
21        return min == Integer.MAX_VALUE ? -1 : min;
22    }
23}