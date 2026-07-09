// Last updated: 7/9/2026, 9:47:38 AM
class Solution {
    public int minimumCost(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return nums[0] + firstMin + secondMin;
    }
}