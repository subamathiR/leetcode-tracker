// Last updated: 7/9/2026, 9:49:08 AM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1, count = 1;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i] == prices[i + 1] + 1) count++;
            else count = 1;
            ans += count;
        }
        return ans;
    }
}