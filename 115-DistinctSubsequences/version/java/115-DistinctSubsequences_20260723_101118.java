// Last updated: 7/23/2026, 10:11:18 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int dp[][] = new int[n+1][m+1];
6        for(int i=0;i<n;i++){
7            dp[i][0] = 1;
8        }
9        for(int i=1;i<=n;i++){
10            for(int j=1;j<=m;j++){
11                if(s.charAt(i-1) == t.charAt(j-1)){
12                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
13                }
14                else{
15                    dp[i][j] = dp[i-1][j];
16                }
17            }
18        }
19        return dp[n][m];
20    }
21}