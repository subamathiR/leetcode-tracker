// Last updated: 7/9/2026, 9:52:23 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
         int row = matrix.length;
         int col = matrix[0].length;
         int b[][] = new int[col][row];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                b[j][i]=matrix[i][j];
            }
        }
        return b;
    }
}