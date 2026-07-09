// Last updated: 7/9/2026, 9:49:05 AM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
         int sum = 0;
         for(int i=cost.length-1;i>=0;i-=3){
            sum+=cost[i];
            if(i-1>=0){
                sum+=cost[i-1];
            }
         }
         return sum;
    }
}