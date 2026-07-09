// Last updated: 7/9/2026, 9:52:59 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int t = 0;
        for(int i : nums){
            t += i;
        }
        int l = 0;
        for(int i = 0; i < nums.length; i++){
            t -= nums[i];
            if(l == t){
                return i;
            }
            l += nums[i];
        }

        return -1;
    }
}