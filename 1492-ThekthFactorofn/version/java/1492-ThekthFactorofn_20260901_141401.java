// Last updated: 9/1/2026, 2:14:01 PM
1class Solution {
2    public int kthFactor(int n, int k) {
3        for (int i = 1; i <= n; i++) {
4            if (n % i == 0) {
5                k--;
6                if (k == 0) {
7                    return i;
8                }
9            }
10        }
11        return -1;
12    }
13}