// Last updated: 8/5/2026, 10:15:54 AM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        HashSet<String> set = new HashSet<>(wordDict);
4        boolean dp[] = new boolean[s.length()+1];
5        dp[0] = true;
6        for(int i=1;i<=s.length();i++){
7            for(int j=0;j<=i;j++){
8            if(dp[j] && set.contains(s.substring(j,i))){
9                dp[i] = true; 
10                break;
11               } 
12            }
13         }
14        return dp[s.length()];
15    }
16}