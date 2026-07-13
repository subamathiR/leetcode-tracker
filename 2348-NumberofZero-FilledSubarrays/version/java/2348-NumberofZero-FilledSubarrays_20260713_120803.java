// Last updated: 7/13/2026, 12:08:03 PM
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3        int count = 0;
4        int max = 0;
5        for(int i=2;i<nums.length;i++){
6            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
7                count++;
8                max+=count;
9            }
10            else{
11                count = 0;
12            }
13        }
14        return max;
15    }
16}