// Last updated: 7/9/2026, 9:53:05 AM
class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prev = 0;
        int curr = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        return ans + Math.min(prev, curr);
    }
}