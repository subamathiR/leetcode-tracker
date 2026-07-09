// Last updated: 7/9/2026, 9:50:50 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int rep = 0;
        int c = 0;
        int start = 0;
        int max = 0;
        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                rep++;
            }
            while(rep > 1){
                if(nums[start] == 0){
                    rep--;
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}