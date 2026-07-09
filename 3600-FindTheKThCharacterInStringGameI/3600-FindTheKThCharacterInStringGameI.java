// Last updated: 7/9/2026, 9:46:55 AM
class Solution {
    public char kthCharacter(int k) {
         StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int size = sb.length();
            for (int i = 0; i < size; i++) {
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }
}