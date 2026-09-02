// Last updated: 9/2/2026, 10:15:34 AM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left = 0;
4        long right = (long)Math.sqrt(c);
5        while(left <= right){
6            long sum = left * left + right * right;
7            if(sum == c){
8                return true;
9            }
10            else if(sum < c){
11                left++;
12            }
13            else{
14                right--;
15            }
16        }
17        return false;
18    }
19}