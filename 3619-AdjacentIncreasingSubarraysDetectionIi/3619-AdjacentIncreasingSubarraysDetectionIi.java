// Last updated: 7/9/2026, 9:46:41 AM
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size(), i = 0, res = 0;
        int prev = 0;

        while (i < n) {
            int start = i;

            while (i + 1 < n && nums.get(i) < nums.get(i + 1)) {
                i++;
            }

            int curr = i - start + 1;
            res = Math.max(res, Math.max(curr >> 1, Math.min(curr, prev)));
            
            prev = curr;
            i++;
        }
        
        return res;
    }
}