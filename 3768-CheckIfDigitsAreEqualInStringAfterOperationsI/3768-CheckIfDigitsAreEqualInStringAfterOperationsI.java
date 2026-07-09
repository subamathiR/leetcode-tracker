// Last updated: 7/9/2026, 9:46:11 AM
class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i + 1 < n; i++) {
            int coef = nCkMod10(n - 2, i);
            num1 = (num1 + coef * (s.charAt(i) - '0')) % 10;
            num2 = (num2 + coef * (s.charAt(i + 1) - '0')) % 10;
        }
        return num1 == num2;
    }

    // Compute nCk mod 10
    private int nCkMod10(int n, int k) {
        int mod2 = lucas(n, k, 2);
        int mod5 = lucas(n, k, 5);
        // lookup for combination mod10 based on mod2 and mod5 values
        int[][] lookup = {
            {0, 6, 2, 8, 4},  // mod2 == 0
            {5, 1, 7, 3, 9}   // mod2 == 1
        };
        return lookup[mod2][mod5];
    }

    // Lucas Theorem to compute C(n, k) mod prime
    private int lucas(int n, int k, int p) {
        int res = 1;
        while (n > 0 || k > 0) {
            int ni = n % p;
            int ki = k % p;
            if (ki > ni) return 0;
            res = (res * nCk(ni, ki)) % p;
            n /= p;
            k /= p;
        }
        return res;
    }

    // Compute basic C(n, k) (no mod) for small n, k
    private int nCk(int n, int k) {
        if (k > n) return 0;
        int ans = 1;
        for (int i = 1; i <= k; i++) {
            ans = ans * (n - k + i) / i;
        }
        return ans;
    }
}