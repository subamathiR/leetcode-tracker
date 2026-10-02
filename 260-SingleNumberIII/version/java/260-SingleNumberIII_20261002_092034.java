// Last updated: 10/2/2026, 9:20:34 AM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        List<Integer> res = new ArrayList<>();
4        Map<Integer,Integer> map = new HashMap<>();
5        for(int i : nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        for(Map.Entry<Integer,Integer> e : map.entrySet()){
9            if(e.getValue()==1){
10                res.add(e.getKey());
11            }
12        }
13        int a[] = new int[res.size()];
14        for(int i=0;i<res.size();i++){
15            a[i] = res.get(i);
16        }
17        return a;
18    }
19}