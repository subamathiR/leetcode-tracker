// Last updated: 8/31/2026, 11:19:55 AM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        int n = names.length;
4        String[][] arr = new String[n][2];
5        for (int i = 0; i < n; i++) {
6            arr[i][0] = names[i];
7            arr[i][1] = String.valueOf(heights[i]);
8        }
9        Arrays.sort(arr, (a, b) ->
10            Integer.parseInt(b[1]) - Integer.parseInt(a[1])
11        );
12        String[] answer = new String[n];
13        for (int i = 0; i < n; i++) {
14            answer[i] = arr[i][0];
15        }
16        return answer;
17    }
18}