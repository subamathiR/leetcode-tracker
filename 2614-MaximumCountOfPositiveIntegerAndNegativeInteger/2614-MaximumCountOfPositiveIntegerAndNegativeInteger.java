// Last updated: 7/9/2026, 9:48:31 AM
class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int n1: nums)
        {   
            if(n1>0)
            {
                p++;
            }
            else if(n1<0)
            {
                n++;
            }
        }
        return Math.max(p,n);
    }
}