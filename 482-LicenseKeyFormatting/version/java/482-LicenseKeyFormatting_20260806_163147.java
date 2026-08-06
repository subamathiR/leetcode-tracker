// Last updated: 8/6/2026, 4:31:47 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        s = s.toUpperCase();
5        for(int i=s.length()-1;i>=0;i--){
6            char ch = s.charAt(i);
7            if(ch=='-')
8            continue;
9            if(sb.length() % (k+1) == k)
10                sb.append('-');
11            sb.append(ch);
12
13        }
14        return sb.reverse().toString();
15    }
16}