// Last updated: 7/9/2026, 9:52:21 AM
class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int last = -1;
        int position = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) {
                    max = Math.max(max, position - last);
                }
                last = position;
            }
            position++;
            n = n >> 1;
        }
        
        return max;
    }
}