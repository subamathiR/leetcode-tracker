// Last updated: 9/3/2026, 12:18:46 PM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int sum = 0;
4        int square = 0;
5        while(n>0){
6            int d = n%10;
7            sum+=d;
8            square += d*d;
9            n/=10;
10           
11        }
12        return square-sum>=50;
13    }
14}