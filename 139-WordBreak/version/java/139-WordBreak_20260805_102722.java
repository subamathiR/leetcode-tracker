// Last updated: 8/5/2026, 10:27:22 AM
1class Solution {
2    public int minExtraChar(String s, String[] dictionary) {
3        HashSet<String> set = new HashSet<>();
4        for (String word : dictionary) {
5            set.add(word);
6        }
7        int n = s.length();
8        int[] dp = new int[n + 1];
9        dp[n] = 0;
10        for (int i = n - 1; i >= 0; i--) {
11            dp[i] = 1 + dp[i + 1];
12            for (int j = i; j < n; j++) {
13                String sub = s.substring(i, j + 1);
14                if (set.contains(sub)) {
15                    dp[i] = Math.min(dp[i], dp[j + 1]);
16                }
17            }
18        }
19        return dp[0];
20    }
21}