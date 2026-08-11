// Last updated: 8/11/2026, 10:23:34 AM
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        boolean[][] isPal = new boolean[n][n];
5        for (int end = 0; end < n; end++) {
6            for (int start = 0; start <= end; start++) {
7                if (s.charAt(start) == s.charAt(end) &&
8                    (end - start <= 2 || isPal[start + 1][end - 1])) {
9                    isPal[start][end] = true;
10                }
11            }
12        }
13        int[] dp = new int[n];
14        for (int i = 0; i < n; i++) {
15            if (isPal[0][i]) {
16                dp[i] = 0;
17            } 
18            else {
19                dp[i] = i;
20                for (int j = 1; j <= i; j++) {
21                    if (isPal[j][i]) {
22                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
23                    }
24                }
25            }
26        }
27        return dp[n - 1];
28    }
29}