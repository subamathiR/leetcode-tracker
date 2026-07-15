// Last updated: 7/15/2026, 9:55:23 AM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        Map<Integer,Integer> map = new HashMap<>();
4        map.put(0,-1);
5        int sum = 0;
6        int max = 0;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0)
9            sum+=-1;
10            else
11            sum+=1;
12            if(map.containsKey(sum))
13            {
14                int len = i-map.get(sum);
15                max = Math.max(max,len);
16            }
17            else{
18                map.put(sum,i);
19            }
20        }
21        return max;
22    }
23}