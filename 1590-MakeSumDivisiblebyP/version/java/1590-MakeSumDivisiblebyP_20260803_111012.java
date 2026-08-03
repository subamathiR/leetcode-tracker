// Last updated: 8/3/2026, 11:10:12 AM
1class Solution {
2    public int countKDifference(int[] nums, int k) {
3        int n = nums.length;
4        int c = 0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7
8                if( Math.abs(nums[i]-nums[j])==k && i < j){
9                    c++;
10                }
11            }
12        }
13        return c;
14    }
15}