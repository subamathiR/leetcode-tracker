// Last updated: 9/7/2026, 11:14:35 AM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5        for (int i = n-1; i >= 0; i--) {
6            dp[i][i] = 1;
7            for (int j = i+1; j < n; j++) {
8                if (s.charAt(i) == s.charAt(j)) {
9                    dp[i][j] = 2 + dp[i+1][j-1];
10                } else {
11                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
12                }
13            }
14        }
15        return dp[0][n-1];
16    }
17}