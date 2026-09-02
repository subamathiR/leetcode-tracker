// Last updated: 9/2/2026, 8:19:36 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int a[] = new int[nums.length];
4        int pl = 1;
5        int pr = 1;
6        for(int i=0;i<nums.length;i++){
7            a[i] = pl;
8            pl *= nums[i];
9        }
10        for(int i = nums.length-1;i>=0;i--){
11            a[i] *= pr;
12            pr *= nums[i];
13        }
14        return a;
15    }
16}