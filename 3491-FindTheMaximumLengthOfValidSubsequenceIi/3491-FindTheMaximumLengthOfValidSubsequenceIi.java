// Last updated: 7/9/2026, 9:47:05 AM
class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k]; 

        int ans = 0; // This will store the final answer - the maximum length found.

        // We go through each number in the input array 'nums'
        for (int n : nums) {
            // Calculate the remainder of the current number when divided by k.
            int x = n % k; 

            // Now, we iterate through all possible remainders 'y' (from 0 to k-1)
            for (int y = 0; y < k; y++) {
                dp[x][y] = dp[y][x] + 1; 

                
                ans = Math.max(ans, dp[x][y]);
            }
        }

        // Finally, return the maximum length found.
        return ans;
    }
}