// Last updated: 7/9/2026, 9:46:44 AM
class Solution {
    public int possibleStringCount(String word) {
         int ans = 0;
        char prevChar = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == prevChar) {
                ans++;
            } else {
                prevChar = c;
            }
        }
        return ans + 1;
    }
}