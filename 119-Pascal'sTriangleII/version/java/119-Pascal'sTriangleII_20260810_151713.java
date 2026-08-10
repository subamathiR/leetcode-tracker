// Last updated: 8/10/2026, 3:17:13 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> result = new ArrayList<>();
4        result.add(1);
5        for (int i = 1; i <= rowIndex; i++) {
6            for (int j = i - 1; j >= 1; j--) {
7                result.set(j, result.get(j) + result.get(j - 1));
8            }
9            result.add(1);
10        }
11        return result;
12    }
13}