// Last updated: 8/12/2026, 12:21:29 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        Map<Character, Integer> map = new HashMap<>();
4        for (char ch : s.toCharArray()) {
5            map.put(ch, map.getOrDefault(ch, 0) + 1);
6        }
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9            if (map.get(ch) < k) {
10                int left = longestSubstring(s.substring(0, i), k);
11                int right = longestSubstring(s.substring(i + 1), k);
12                return Math.max(left, right);
13            }
14        }
15        return s.length();
16    }
17}