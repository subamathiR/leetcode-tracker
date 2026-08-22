// Last updated: 8/22/2026, 10:24:26 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        long t = n;
4        long sum = 0;
5        long product = 1;
6        while(n>0){
7            int d = n%10;
8            sum+=d;
9            product*=d;
10            n/=10;
11        }
12        return t%(sum+product) == 0;
13        
14    }
15}