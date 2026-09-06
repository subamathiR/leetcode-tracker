// Last updated: 9/6/2026, 12:59:01 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3       Map<Integer,Integer> map = new HashMap<>();
4       for(int i : nums){
5        map.put(i,map.getOrDefault(i,0)+1);
6       }
7       List<Map.Entry<Integer,Integer>> l = new ArrayList<>(map.entrySet());
8       l.sort((a,b)-> b.getValue()-a.getValue());
9       int r[] = new int[k];
10       for(int i=0;i<k;i++){
11           r[i] = l.get(i).getKey();
12       }
13       return r;
14    }
15}