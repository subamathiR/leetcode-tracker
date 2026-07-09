// Last updated: 7/9/2026, 9:52:40 AM
import java.util.*;

class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {

        // Step 1: Create the grid
        int[][] grid = new int[n][n];

        // Step 2: Fill every cell with 1
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], 1);
        }

        // Step 3: Mark mines as 0
        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        // Step 4: Create DP arrays
        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] up = new int[n][n];
        int[][] down = new int[n][n];

        // Step 5: Fill left array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {

                    if (j == 0)
                        left[i][j] = 1;
                    else
                        left[i][j] = left[i][j - 1] + 1;
                }
            }
        }

        // Step 6: Fill right array
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {

                if (grid[i][j] == 1) {

                    if (j == n - 1)
                        right[i][j] = 1;
                    else
                        right[i][j] = right[i][j + 1] + 1;
                }
            }
        }

        // Step 7: Fill up array
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {

                if (grid[i][j] == 1) {

                    if (i == 0)
                        up[i][j] = 1;
                    else
                        up[i][j] = up[i - 1][j] + 1;
                }
            }
        }

        // Step 8: Fill down array
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {

                if (grid[i][j] == 1) {

                    if (i == n - 1)
                        down[i][j] = 1;
                    else
                        down[i][j] = down[i + 1][j] + 1;
                }
            }
        }

        // Step 9: Find the answer
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int order = Math.min(
                        Math.min(left[i][j], right[i][j]),
                        Math.min(up[i][j], down[i][j]));

                ans = Math.max(ans, order);
            }
        }

        return ans;
    }
}