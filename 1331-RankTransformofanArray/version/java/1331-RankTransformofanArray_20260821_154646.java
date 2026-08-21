// Last updated: 8/21/2026, 3:46:46 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sorted = arr.clone();
4        Arrays.sort(sorted);
5        HashMap<Integer, Integer> map = new HashMap<>();
6        int rank = 1;
7        for (int i = 0; i < sorted.length; i++) {
8            if (!map.containsKey(sorted[i])) {
9                map.put(sorted[i], rank);
10                rank++;
11            }
12        }
13        for (int i = 0; i < arr.length; i++) {
14            arr[i] = map.get(arr[i]);
15        }
16        return arr;
17    }
18}