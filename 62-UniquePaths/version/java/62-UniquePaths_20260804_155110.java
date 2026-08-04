// Last updated: 8/4/2026, 3:51:10 PM
1public class Solution {
2    public int uniquePaths(int m, int n) {
3        long ans = 1;
4        for (int i = 1; i <= m - 1; i++) {
5            ans = ans * (n - 1 + i) / i;
6        }
7        return (int)ans;
8    }
9}