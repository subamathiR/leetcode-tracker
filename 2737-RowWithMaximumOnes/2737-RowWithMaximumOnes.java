// Last updated: 7/9/2026, 9:48:07 AM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int r=0;
        int col=0;
         
        for(int i=0;i<m;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(c>col)
            {
                col=c;
                r=i;
            }
        }
         
        return new int[]  {r,col};
        
    }
}