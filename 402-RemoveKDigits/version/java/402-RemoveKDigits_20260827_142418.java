// Last updated: 8/27/2026, 2:24:18 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        StringBuilder sb = new StringBuilder();
4        for (char c : num.toCharArray()) {
5            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
6                sb.deleteCharAt(sb.length() - 1);
7                k--;
8            }
9            sb.append(c);
10        }
11        while (k > 0) {
12            sb.deleteCharAt(sb.length() - 1);
13            k--;
14        }
15        int i = 0;
16        while (i < sb.length() && sb.charAt(i) == '0') {
17            i++;
18        }
19
20        String ans = sb.substring(i);
21        if (ans.length() == 0) {
22            return "0";
23        }
24        return ans;
25    }
26}