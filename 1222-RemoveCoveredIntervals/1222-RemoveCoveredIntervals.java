// Last updated: 7/9/2026, 9:51:40 AM
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->{
           if(a[0] == b[0]){
               return b[1]-a[1];
           }
           return a[0]-b[0];
       });
       int count = 0;
       int max = 0;
       for(int interval[]: intervals){
          if(interval[1] > max){
            count++;
            max = interval[1];
          }
       }
       return count;
    }
}