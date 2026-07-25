// Last updated: 7/25/2026, 3:14:25 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int total = m * n;
6        k %= total;
7        List<List<Integer>> ans = new ArrayList<>();
8        for (int i = 0; i < m; i++) {
9            List<Integer> row = new ArrayList<>();
10            for (int j = 0; j < n; j++) {
11                row.add(0);
12            }
13            ans.add(row);
14        }
15        for (int i = 0; i < m; i++) {
16            for (int j = 0; j < n; j++) {
17                int oldIndex = i * n + j;
18                int newIndex = (oldIndex + k) % total;
19                int newRow = newIndex / n;
20                int newCol = newIndex % n;
21                ans.get(newRow).set(newCol, grid[i][j]);
22            }
23        }
24
25        return ans;
26    }
27}