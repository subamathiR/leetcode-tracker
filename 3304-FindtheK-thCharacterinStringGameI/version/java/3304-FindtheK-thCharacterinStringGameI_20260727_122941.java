// Last updated: 7/27/2026, 12:29:41 PM
1class Solution {
2    public char kthCharacter(int k) {
3        StringBuilder word = new StringBuilder("a");
4        while (word.length() < k) {
5            int n = word.length();
6            for (int i = 0; i < n; i++) {
7                char ch = word.charAt(i);
8                if (ch == 'z')
9                    word.append('a');
10                else
11                    word.append((char) (ch + 1));
12            }
13        }
14        return word.charAt(k - 1);
15    }
16}