// Last updated: 7/9/2026, 9:52:33 AM

class Solution {
    public double soupServings(int n) {
        if (n > 4800) return 1.0;
        int scaledN = (int) Math.ceil(n / 25.0);

        double[][] dp = new double[scaledN + 1][scaledN + 1];
        for (int i = 0; i <= scaledN; i++) {
            for (int j = 0; j <= scaledN; j++) {
                dp[i][j] = -1.0;
            }
        }

        int[][] ops = {
            {4, 0},
            {3, 1},
            {2, 2},
            {1, 3}
        };

        return serve(scaledN, scaledN, dp, ops);
    }

    private double serve(int a, int b, double[][] memo, int[][] ops) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;

        if (memo[a][b] != -1.0) return memo[a][b];

        double prob = 0.0;
        for (int[] op : ops) {
            prob += serve(a - op[0], b - op[1], memo, ops);
        }

        memo[a][b] = prob / 4.0;
        return memo[a][b];
    }
}
