// Last updated: 8/27/2026, 2:29:54 PM
1class Solution {
2    public int findGCD(int[] nums) {
3       int min = nums[0];
4       int max = nums[0];
5       for(int i=0;i<nums.length;i++){
6        min = Math.min(min,nums[i]);
7        max = Math.max(max,nums[i]);
8       }
9       int a = min;
10       int b = max;
11       while(b!=0){
12        int t = b;
13        b = a%b;
14        a = t;
15       }
16       return a;
17    }
18}