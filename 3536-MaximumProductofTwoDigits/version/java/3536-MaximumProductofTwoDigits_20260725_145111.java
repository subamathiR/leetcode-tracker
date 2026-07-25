// Last updated: 7/25/2026, 2:51:11 PM
1class Solution {
2    public int maxProduct(int n) {
3        int fm = 0;
4        int sm = 0;
5        while(n>0){
6            int d = n%10;
7            if(d>=fm){
8                sm = fm;
9                fm = d;
10            }
11            else if(d>=sm){
12                sm = d;
13            }
14            n/=10;
15        }
16        return fm*sm;
17    }
18}
19