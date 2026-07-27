// Last updated: 7/27/2026, 9:40:53 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = Integer.MIN_VALUE;
4        int n = nums.length;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7              int res = (nums[i]-1)*(nums[j]-1);
8              max = Math.max(max,res);
9            }
10        }
11        return max;
12    }
13}