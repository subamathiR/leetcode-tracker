// Last updated: 8/27/2026, 2:35:47 PM
1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3       if(!(str1 + str2).equals(str2 + str1))
4       return "";
5       int a = str1.length();
6       int b = str2.length();
7       while(b!=0){
8        int t = b;
9        b = a%b;
10        a = t;
11       }
12       return str1.substring(0,a);
13    }
14}