// Last updated: 7/9/2026, 9:45:20 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = 1;
        int j = 0;
        for(int i=0;i<n;i++){
           while (j < n && nums[j] <= (long) nums[i] * k){
                j++;
            }
            m = Math.max(m,j-i);
        }
        return n-m;
    }
}