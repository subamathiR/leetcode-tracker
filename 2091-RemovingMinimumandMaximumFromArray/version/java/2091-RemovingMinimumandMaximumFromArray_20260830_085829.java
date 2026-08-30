// Last updated: 8/30/2026, 8:58:29 AM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int min = nums[0];
4        int max = nums[0];
5        int minIndex = 0;
6        int maxIndex = 0;
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] < min) {
9                min = nums[i];
10                minIndex = i;
11            }
12            if (nums[i] > max) {
13                max = nums[i];
14                maxIndex = i;
15            }
16        }
17        int left = Math.min(minIndex, maxIndex);
18        int right = Math.max(minIndex, maxIndex);
19        int n = nums.length;
20        int c1 = right + 1;            
21        int c2 = n - left;               
22        int c3 = left + 1 + n - right; 
23        return Math.min(c1, Math.min(c2, c3));
24    }
25}