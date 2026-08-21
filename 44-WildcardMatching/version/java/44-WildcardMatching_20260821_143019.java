// Last updated: 8/21/2026, 2:30:19 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0;
4        int j = 0;
5        int star = -1;
6        int match = 0;
7        while (i < s.length()) {
8            if (j < p.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
9                i++;
10                j++;
11            }
12            else if (j < p.length() && p.charAt(j) == '*') {
13                star = j;
14                match = i;
15                j++;
16            }
17            else if (star != -1) {
18                j = star + 1;
19                match++;
20                i = match;
21            }
22            else {
23                return false;
24            }
25        }
26        while (j < p.length() && p.charAt(j) == '*') {
27            j++;
28        }
29        return j == p.length();
30    }
31}