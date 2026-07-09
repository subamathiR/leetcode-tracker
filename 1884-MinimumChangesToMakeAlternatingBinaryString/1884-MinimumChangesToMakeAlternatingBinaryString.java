// Last updated: 7/9/2026, 9:50:07 AM
class Solution {
    public int minOperations(String s) {
        int n = s.length(), c = 0, j = 0;
        for(char ch : s.toCharArray()) {
            if(ch - '0' == j) c++;
            j ^= 1;
        }
        return Math.min(c, n - c);
    }
}