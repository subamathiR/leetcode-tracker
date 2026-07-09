// Last updated: 7/9/2026, 9:48:35 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, streak = 0;
        for (int num : nums) {
            streak = (num == 0) ? streak + 1 : 0;
            cnt += streak;
        }
        return cnt;
    }
}