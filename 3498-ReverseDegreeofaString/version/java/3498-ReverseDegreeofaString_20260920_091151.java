// Last updated: 9/20/2026, 9:11:51 AM
1class Solution {
2    public int reverseDegree(String s) {
3        int sum = 0;
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6            int value = 'z' - ch + 1;
7            sum += value * (i + 1);
8        }
9        return sum;
10    }
11}