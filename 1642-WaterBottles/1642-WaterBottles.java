// Last updated: 7/9/2026, 9:50:35 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0; // empty bottles
        
        while (numBottles > 0) {
            drinked += numBottles;   // drink all current bottles
            eb += numBottles;        // get empty bottles
            
            numBottles = eb / numExchange; // exchange empties for new bottles
            eb = eb % numExchange;         // leftover empties
        }
        return drinked;
    }
}