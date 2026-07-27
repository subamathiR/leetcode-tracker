// Last updated: 7/27/2026, 12:07:50 PM
1class Solution {
2    public String replaceDigits(String s) {
3        StringBuilder sb = new StringBuilder();
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6            if (Character.isLetter(ch)) {
7                sb.append(ch);
8            } else {
9                int d = ch - '0';
10                char newChar = (char) (s.charAt(i - 1) + d);
11                sb.append(newChar);
12            }
13        }
14        return sb.toString();
15    }
16}