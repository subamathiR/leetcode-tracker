// Last updated: 7/9/2026, 9:51:26 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int num:arr){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(int c:m.values()){
            if(s.contains(c)){
                return false;
            }
            s.add(c);
            
        }
        return true;
    }
}