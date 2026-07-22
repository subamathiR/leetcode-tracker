// Last updated: 7/22/2026, 2:13:19 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] dp = new int[m][n];
6        dp[m - 1][n - 1] = grid[m - 1][n - 1];
7        for (int i = m - 1; i >= 0; i--) {
8            for (int j = n - 1; j >= 0; j--) {
9                if (i == m - 1 && j == n - 1) {
10                    continue;
11                }
12                if (isValid(i + 1, j, m, n) && isValid(i, j + 1, m, n)) {
13                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
14                } else if (isValid(i + 1, j, m, n)) {
15                    dp[i][j] = grid[i][j] + dp[i + 1][j];
16                } else {
17                    dp[i][j] = grid[i][j] + dp[i][j + 1];
18                }
19            }
20        }
21
22        return dp[0][0];
23    }
24    private boolean isValid(int x, int y, int m, int n) {
25        return x >= 0 && x < m && y >= 0 && y < n;
26    }
27}