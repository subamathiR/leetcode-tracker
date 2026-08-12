// Last updated: 8/12/2026, 11:55:31 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int left = 0;
5        int max = 0;
6        for(int right = 0;right < nums.length;right++){
7            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
8             while(map.get(nums[right]) > k){
9                map.put(nums[left],map.get(nums[left])-1);
10                left++;
11             }
12             max = Math.max(max,right-left+1);
13        }
14       return max;
15    }
16}