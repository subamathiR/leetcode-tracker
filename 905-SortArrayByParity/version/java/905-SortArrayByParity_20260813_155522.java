// Last updated: 8/13/2026, 3:55:22 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int[] result = new int[nums.length];
4        int index = 0;
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] % 2 == 0) {
7                result[index] = nums[i];
8                index++;
9            }
10        }
11        for (int i = 0; i < nums.length; i++) {
12            if (nums[i] % 2 != 0) {
13                result[index] = nums[i];
14                index++;
15            }
16        }
17
18        return result;
19    }
20}