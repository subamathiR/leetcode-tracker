// Last updated: 9/3/2026, 12:32:52 PM
1class Solution {
2    public int maxDigitRange(int[] nums) {
3
4        int maxRange = -1;
5        int answer = 0;
6
7        for (int num : nums) {
8
9            int temp = num;
10            int max = 0;
11            int min = 9;
12
13            while (temp > 0) {
14
15                int digit = temp % 10;
16
17                max = Math.max(max, digit);
18                min = Math.min(min, digit);
19
20                temp /= 10;
21            }
22
23            int range = max - min;
24
25            if (range > maxRange) {
26                maxRange = range;
27                answer = num;
28            }
29            else if (range == maxRange) {
30                answer += num;
31            }
32        }
33
34        return answer;
35    }
36}