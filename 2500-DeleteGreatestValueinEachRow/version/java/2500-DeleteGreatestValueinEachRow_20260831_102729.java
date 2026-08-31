// Last updated: 8/31/2026, 10:27:29 AM
1class Solution {
2    public int deleteGreatestValue(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        for(int i=0;i<n;i++){
6            Arrays.sort(grid[i]);
7        }
8        int ans = 0;
9        for(int j = m-1;j>=0;j--){
10            int max = 0;
11            for(int i=0;i<n;i++){
12                max = Math.max(max,grid[i][j]);
13            }
14            ans+=max;
15        }
16        return ans;
17    }
18}