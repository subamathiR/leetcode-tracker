// Last updated: 8/7/2026, 2:29:35 PM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4        for (int i = 1; i <= n; i++) {
5            dp[i] = i; 
6            for (int j = 1; j * j <= i; j++) {
7                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
8            }
9        }
10        return dp[n];
11    }
12}