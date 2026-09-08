// Last updated: 9/8/2026, 11:37:37 AM
1class Solution {
2    public int totalNQueens(int n) {
3        boolean cols[] = new boolean[n];
4        boolean diag1[] = new boolean[2*n-1];
5        boolean diag2[] = new boolean[2*n-1];
6        return backtrack(0,n,cols,diag1,diag2);
7    }
8    public int backtrack(int row,int n,boolean cols[],boolean diag1[],boolean diag2[]){
9        if(row == n){
10            return 1;
11        }
12        int c = 0;
13        for(int col = 0;col < n;col++){
14            int d1 = row-col+n-1;
15            int d2 = row+col;
16            if(cols[col] || diag1[d1] || diag2[d2]){
17                continue;
18            }
19            cols[col] = true;
20            diag1[d1] = true;
21            diag2[d2] = true;
22            c+=backtrack(row+1,n,cols,diag1,diag2);
23            cols[col] = false;
24            diag1[d1] = false;
25            diag2[d2] = false;
26        }
27        return c;
28    }
29}