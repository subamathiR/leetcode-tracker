// Last updated: 7/9/2026, 9:50:25 AM
class Solution {
    public int minimumOneBitOperations(int n) {
        int res = 0;
        while (n > 0) {
            res ^= n;
            n >>= 1;
        }
        return res;
    }
}