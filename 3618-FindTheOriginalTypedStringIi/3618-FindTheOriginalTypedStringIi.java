// Last updated: 7/9/2026, 9:46:42 AM
import java.util.*;

class Solution {
    public int possibleStringCount(String word, int k) {
        int MOD = 1_000_000_007;
        List<Integer> groups = new ArrayList<>();
        int n = word.length();
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            groups.add(j - i);
            i = j;
        }

        long total = 1;
        for (int len : groups) {
            total = (total * len) % MOD;
        }

        if (groups.size() >= k) return (int) total;

        int[] dp = new int[k];
        dp[0] = 1;

        for (int r : groups) {
            int[] newDp = new int[k];
            int window = 0;
            for (int j = 1; j < k; j++) {
                window = (window + dp[j - 1]) % MOD;
                if (j - r - 1 >= 0) {
                    window = (window - dp[j - r - 1] + MOD) % MOD;
                }
                newDp[j] = window;
            }
            dp = newDp;
        }

        long invalid = 0;
        for (int j = 0; j < k; j++) {
            invalid = (invalid + dp[j]) % MOD;
        }

        return (int) ((total - invalid + MOD) % MOD);
    }
}
