// Last updated: 7/9/2026, 9:50:58 AM
class Solution {
    public int numOfWays(int n) {
        
    int MOD = 1000000007;
    long A = 6, B = 6;

    for (int i = 2; i <= n; i++) {
        long newA = (2 * A + 2 * B) % MOD;
        long newB = (2 * A + 3 * B) % MOD;
        A = newA;
        B = newB;
    }

    return (int)((A + B) % MOD);
}
    
}