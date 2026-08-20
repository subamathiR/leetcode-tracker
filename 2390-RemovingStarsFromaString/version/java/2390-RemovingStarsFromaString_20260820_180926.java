// Last updated: 8/20/2026, 6:09:26 PM
1class Solution {
2    public String removeStars(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for (char ch : s.toCharArray()) {
6            if (ch == '*') {
7                sb.deleteCharAt(sb.length() - 1);
8            } else {
9                sb.append(ch);
10            }
11        }
12
13        return sb.toString();
14    }
15}