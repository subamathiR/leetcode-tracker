// Last updated: 7/9/2026, 9:52:39 AM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
               if(matrix[i][j]!=matrix[i-1][j-1]){
                return false;
               }
            }
        }
        return true;
    }
}