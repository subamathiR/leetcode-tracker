// Last updated: 9/1/2026, 8:57:25 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3       int ans[] = new int[2*nums.length];
4       for(int i=0;i<nums.length;i++){
5          ans[i] = nums[i];
6          ans[nums.length + i] = nums[nums.length-i-1];
7       }
8       return ans;
9    }
10}