// Last updated: 9/1/2026, 2:23:29 PM
1class Solution {
2    public int partitionString(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int count = 1;
5        for (char ch : s.toCharArray()) {
6            if (set.contains(ch)) {
7                count++;
8                set.clear();
9            }
10            set.add(ch);
11        }
12        return count;
13    }
14}