// Last updated: 9/8/2026, 11:24:11 AM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> result = new ArrayList<>();
4        char[][] board = new char[n][n];
5        for(int i = 0;i<n;i++){
6            Arrays.fill(board[i],'.');
7        }
8        boolean cols[] = new boolean[n];
9        boolean diag1[] = new boolean[2*n-1];
10        boolean diag2[] = new boolean[2*n-1];
11        backtrack(0,n,board,cols,diag1,diag2,result);
12        return result;
13    }
14    public void backtrack(int row,int n,char board[][],boolean cols[],boolean diag1[],boolean diag2[],List<List<String>> result){
15        if(row == n){
16            List<String> list = new ArrayList<>();
17            for(char[] r : board){
18                list.add(new String(r));
19            }
20            result.add(list);
21            return;
22        }
23        for(int col = 0;col < n;col++){
24            int d1 = row-col+n-1;
25            int d2 = row+col;
26            if(cols[col] || diag1[d1] || diag2[d2]){
27                continue;
28            }
29            board[row][col] = 'Q';
30            cols[col] = true;
31            diag1[d1] = true;
32            diag2[d2] = true;
33            backtrack(row + 1,n,board,cols,diag1,diag2,result);
34            board[row][col] = '.';
35            cols[col] = false;
36            diag1[d1] = false;
37            diag2[d2] = false;
38        }
39    }
40}