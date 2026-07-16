// Last updated: 7/16/2026, 9:43:50 PM
1class Solution {
2
3    int n, m;
4
5    public int closedIsland(int[][] grid) {
6
7        n = grid.length;
8        m = grid[0].length;
9
10        int count = 0;
11
12        for(int i=0;i<n;i++){
13            for(int j=0;j<m;j++){
14
15                if(grid[i][j] == 0){
16
17                    if(dfs(grid,i,j))
18                        count++;
19
20                }
21
22            }
23        }
24
25        return count;
26    }
27
28    boolean dfs(int[][] grid,int i,int j){
29
30        if(i<0 || i>=n || j<0 || j>=m)
31            return false;
32
33        if(grid[i][j] == 1)
34            return true;
35
36        grid[i][j] = 1;
37
38        boolean up = dfs(grid,i-1,j);
39        boolean down = dfs(grid,i+1,j);
40        boolean left = dfs(grid,i,j-1);
41        boolean right = dfs(grid,i,j+1);
42
43        return up && down && left && right;
44    }
45}