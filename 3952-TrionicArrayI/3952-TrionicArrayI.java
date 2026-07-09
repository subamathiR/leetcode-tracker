// Last updated: 7/9/2026, 9:45:23 AM
 class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 3) return false; // too short to be trionic

        int i = 0;

        // Step 1: first increasing
        while(i + 1 < n && nums[i] < nums[i + 1]) i++;
        if(i == 0) return false; // first segment must exist

        // Step 2: decreasing
        int startSecond = i;
        while(i + 1 < n && nums[i] > nums[i + 1]) i++;
        if(i == startSecond) return false; // decreasing segment must exist

        // Step 3: second increasing
        int startThird = i;
        while(i + 1 < n && nums[i] < nums[i + 1]) i++;
        if(i == startThird) return false; // second increasing segment must exist

        // Step 4: make sure we reached the end
        return i == n - 1;
    }
}
