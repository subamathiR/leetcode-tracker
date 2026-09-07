// Last updated: 9/7/2026, 10:28:04 AM
1class Solution {
2    public int distinctSubseqII(String s) {
3        final long MOD = 1000000007L; 
4        long dp = 1;
5        long[] last = new long[26];
6        for (char c : s.toCharArray()) {
7            int index = c - 'a';
8            long oldDp = dp;
9            dp = (2 * dp - last[index] + MOD) % MOD;
10            last[index] = oldDp;
11        }
12        return (int)((dp - 1 + MOD) % MOD);
13    }
14}