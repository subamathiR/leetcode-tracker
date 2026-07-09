// Last updated: 7/9/2026, 9:47:28 AM
class Solution {
    public int maxBottlesDrunk(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            x++;
            ans++;
        }
        return ans;
    }
}