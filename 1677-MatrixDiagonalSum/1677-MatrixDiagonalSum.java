// Last updated: 7/9/2026, 9:50:31 AM
class Solution {
    public int diagonalSum(int[][] mat) {  
         int sum = 0;
         int n = mat.length;
         for(int i=0;i<n;i++)
         {
            sum+=mat[i][i];
            if(i!=n-1-i)
            {
                sum+=mat[i][n-1-i];
            }
         }
         return sum;
    }
}