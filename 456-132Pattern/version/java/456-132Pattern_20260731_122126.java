// Last updated: 7/31/2026, 12:21:26 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> stack = new Stack<>();
4        int second = Integer.MIN_VALUE;
5        for(int i = nums.length - 1; i >= 0; i--) {
6            if(nums[i] < second)
7                return true;
8            while(!stack.isEmpty() && nums[i] > stack.peek()) {
9                second = stack.pop();
10            }
11            stack.push(nums[i]);
12        }
13        return false;
14    }
15}