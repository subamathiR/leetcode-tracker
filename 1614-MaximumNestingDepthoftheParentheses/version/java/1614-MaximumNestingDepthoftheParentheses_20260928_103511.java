// Last updated: 9/28/2026, 10:35:11 AM
1class Solution {
2    public int maxDepth(String s) {
3        int d = 0;
4        int max = 0;
5        for(char ch : s.toCharArray()){
6            if(ch == '('){
7                d++;
8                max = Math.max(max,d);
9            }
10            if(ch == ')'){
11                d--;
12            }
13        }
14        return max;
15    }
16}