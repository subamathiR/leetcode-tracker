// Last updated: 7/9/2026, 9:51:28 AM
 class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Step 1: Compute prefix sum for each row
        int[][] rowsum = new int[m][n];
        for (int i = 0; i < m; i++) {
            rowsum[i][0] = grid[i][0];
            for (int j = 1; j < n; j++) {
                rowsum[i][j] = rowsum[i][j - 1] + grid[i][j];
            }
        }

        // Step 2: Compute prefix sum for each column
        int[][] colsum = new int[m][n];
        for (int j = 0; j < n; j++) {
            colsum[0][j] = grid[0][j];
            for (int i = 1; i < m; i++) {
                colsum[i][j] = colsum[i - 1][j] + grid[i][j];
            }
        }

        // Step 3: Check squares from largest to smallest
        for (int size = Math.min(m, n); size >= 2; size--) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {
                    // Reference sum: sum of first row in the square
                    int target = rowsum[i][j + size - 1] - (j > 0 ? rowsum[i][j - 1] : 0);
                    boolean valid = true;

                    // Step 4: Check all rows in the square
                    for (int r = i + 1; r < i + size; r++) {
                        int sum = rowsum[r][j + size - 1] - (j > 0 ? rowsum[r][j - 1] : 0);
                        if (sum != target) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) continue;

                    // Step 5: Check all columns in the square
                    for (int c = j; c < j + size; c++) {
                        int sum = colsum[i + size - 1][c] - (i > 0 ? colsum[i - 1][c] : 0);
                        if (sum != target) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) continue;

                    // Step 6: Check both diagonals
                    int d1 = 0, d2 = 0;
                    for (int k = 0; k < size; k++) {
                        d1 += grid[i + k][j + k]; // top-left to bottom-right
                        d2 += grid[i + k][j + size - 1 - k]; // top-right to bottom-left
                    }

                    // If all conditions met, return the current square size
                    if (d1 == target && d2 == target) {
                        return size;
                    }
                }
            }
        }

        // Single cell is always a magic square
        return 1;
    }
}