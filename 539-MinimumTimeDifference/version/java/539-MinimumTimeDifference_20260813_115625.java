// Last updated: 8/13/2026, 11:56:25 AM
1class Solution {
2    public int findMinDifference(List<String> timePoints) {
3        int n = timePoints.size();
4        int[] times = new int[n];
5        for (int i = 0; i < n; i++) {
6            String time = timePoints.get(i);
7            int hours = Integer.parseInt(time.substring(0, 2));
8            int minutes = Integer.parseInt(time.substring(3, 5));
9            times[i] = hours * 60 + minutes;
10        }
11        int min = Integer.MAX_VALUE;
12        for (int i = 0; i < n; i++) {
13            for (int j = i + 1; j < n; j++) {
14                int difference = Math.abs(times[i] - times[j]);
15                difference = Math.min(difference, 1440 - difference);
16                min = Math.min(min, difference);
17            }
18        }
19        return min;
20    }
21}