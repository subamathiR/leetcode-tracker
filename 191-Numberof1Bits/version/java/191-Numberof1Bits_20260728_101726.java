// Last updated: 7/28/2026, 10:17:26 AM
1class Solution {
2    public int hammingWeight(int n) {
3        String s = Integer.toBinaryString(n);
4        int c = 0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='1'){
7                c++;
8            }
9        }
10        return c;
11    }
12}