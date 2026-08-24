// Last updated: 8/24/2026, 12:35:09 PM
1class Solution {
2    public int maxLength(int[] nums) {
3        int n = nums.length;
4        int ans = 1;
5        for (int i = 0; i < n; i++) {
6            long product = 1;
7            long gcd = 0;
8            long lcm = 1;
9            for (int j = i; j < n; j++) {
10                product *= nums[j];
11                long a = gcd;
12                long b = nums[j];
13                while (b != 0) {
14                    long temp = b;
15                    b = a % b;
16                    a = temp;
17                }
18                gcd = a;
19                long x = lcm;
20                long y = nums[j];
21                while (y != 0) {
22                    long temp = y;
23                    y = x % y;
24                    x = temp;
25                }
26                lcm = (lcm / x) * nums[j];
27                if (product == lcm * gcd) {
28                    ans = Math.max(ans, j - i + 1);
29                }
30            }
31        }
32        return ans;
33    }
34}