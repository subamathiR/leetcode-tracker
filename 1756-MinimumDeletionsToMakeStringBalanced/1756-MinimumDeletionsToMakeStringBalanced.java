// Last updated: 7/9/2026, 9:50:22 AM
class Solution {
    public int minimumDeletions(String s) {
        int res = 0;
        int count = 0; 
        
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                count++;
            } else if (count != 0) {
                res++;
                count--;
            }
        }
        
        return res;
    }
}