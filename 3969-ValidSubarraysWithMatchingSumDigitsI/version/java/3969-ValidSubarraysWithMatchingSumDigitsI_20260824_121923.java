// Last updated: 8/24/2026, 12:19:23 PM
1class Solution {
2    public int countValidSubarrays(int[] nums, int x) {
3        int n = nums.length;
4        int count = 0;
5        for (int i = 0; i < n; i++) {
6            long sum = 0;
7            for (int j = i; j < n; j++) {
8                sum += nums[j];
9                if (sum % 10 == x) {
10                    long temp = sum;
11                    while (temp >= 10) {
12                        temp /= 10;
13                    }
14                    if (temp == x) {
15                        count++;
16                    }
17                }
18            }
19        }
20        return count;
21    }
22}