// Last updated: 10/3/2026, 9:56:41 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int min = 0;
4        int max = 0;
5        for(int i=0;i<s.length();i++){
6            char ch = s.charAt(i);
7            if(ch=='('){
8                min++;
9                max++;
10            }
11            else if(ch==')'){
12                min--;
13                max--;
14            }
15            else{
16                min--;
17                max++;
18            }
19            if(max < 0){
20                return false;
21            }
22            if(min < 0){
23                min = 0;
24            }
25        }
26        return min == 0;
27    }
28}