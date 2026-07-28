// Last updated: 7/28/2026, 10:24:24 AM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int xor = x ^ y;
4        int count = 0;
5
6        while (xor != 0) {
7            count += xor & 1;
8            xor >>= 1;
9        }
10
11        return count;
12    }
13}