// Last updated: 9/9/2026, 12:15:21 PM
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4        if (n >= 1000) {
5            ans += n - 999;
6        }
7        if (n >= 1000000) {
8            ans += n - 999999;
9        }
10        if (n >= 1000000000) {
11            ans += n - 999999999;
12        }
13        if (n >= 1000000000000L) {
14            ans += n - 999999999999L;
15        }
16        if (n >= 1000000000000000L) {
17            ans += n - 999999999999999L;
18        }
19        return ans;
20    }
21}