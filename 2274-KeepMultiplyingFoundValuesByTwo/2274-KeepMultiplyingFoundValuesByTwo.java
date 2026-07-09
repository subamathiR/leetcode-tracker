// Last updated: 7/9/2026, 9:48:58 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == original){
                original = 2*original;
                i = -1;
            }
        }
        return original;
    }
}