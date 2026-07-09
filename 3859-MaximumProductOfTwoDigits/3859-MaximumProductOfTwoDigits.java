// Last updated: 7/9/2026, 9:45:44 AM
class Solution {
    public int maxProduct(int n) {
        int firstMax = 0;
        int secondMax = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit >= firstMax) {
                secondMax = firstMax;
                firstMax = digit;
            } else if (digit > secondMax) {
                secondMax = digit;
            }
            n /= 10;
        }
        return firstMax * secondMax;
    }
}
