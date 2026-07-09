// Last updated: 7/9/2026, 9:49:24 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int diff=Math.abs(nums[i]-nums[j]);
                    if(ans<diff){
                        ans=diff;
                    }
                }
            }
        }
        return ans;
    }
}