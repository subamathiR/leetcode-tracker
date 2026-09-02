// Last updated: 9/2/2026, 11:44:43 AM
1class Solution {
2    public int commonFactors(int a, int b) {
3        int count = 0;
4        for (int i = 1; i <= Math.min(a, b); i++) {
5            if (a % i == 0 && b % i == 0) {
6                count++;
7            }
8        }
9
10        return count;
11    }
12}