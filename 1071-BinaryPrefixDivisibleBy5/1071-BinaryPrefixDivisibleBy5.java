// Last updated: 7/9/2026, 9:51:47 AM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int msb=0;
        for(int x: nums){
            msb=((msb<<1)+x)%5;
            ans.add(msb==0);
        }
        return ans;
    }
}