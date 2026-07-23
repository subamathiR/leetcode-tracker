// Last updated: 7/23/2026, 10:26:51 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if(n<3)
5        return n;
6        int p = 1;
7        while(p<=n)
8        p = p<<=1;
9        return p;
10    }
11}