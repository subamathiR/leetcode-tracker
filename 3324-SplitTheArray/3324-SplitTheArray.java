// Last updated: 7/9/2026, 9:47:32 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>2){
                return false;
            }
        }
        return true;
    }
}