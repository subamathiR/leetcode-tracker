// Last updated: 7/9/2026, 9:49:15 AM
class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
         for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                int a = Math.abs(i-j);
                max = Math.max(max,a);
            }}
         }
         return max;
    }
}