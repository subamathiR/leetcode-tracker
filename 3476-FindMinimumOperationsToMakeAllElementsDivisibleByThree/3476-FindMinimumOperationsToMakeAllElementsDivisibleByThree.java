// Last updated: 7/9/2026, 9:47:10 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0) res++;
        }
        return res;
    }
}