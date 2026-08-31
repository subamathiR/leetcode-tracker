// Last updated: 8/31/2026, 10:34:25 AM
1class Solution {
2    public int equalPairs(int[][] grid) {
3        int n = grid.length;
4        int count = 0;
5        for (int i = 0; i < n; i++) {
6            for (int j = 0; j < n; j++) {
7                boolean equal = true;
8                for (int k = 0; k < n; k++) {
9                    if (grid[i][k] != grid[k][j]) {
10                        equal = false;
11                        break;
12                    }
13                }
14                if (equal) {
15                    count++;
16                }
17            }
18        }
19        return count;
20    }
21}