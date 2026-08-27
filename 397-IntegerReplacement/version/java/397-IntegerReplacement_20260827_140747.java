// Last updated: 8/27/2026, 2:07:47 PM
1class Solution {
2    public int integerReplacement(int n) {
3        long x = n;
4        int count = 0;
5        while (x != 1) {
6            if (x % 2 == 0) {
7                x = x / 2;
8            } 
9            else {
10                if (x == 3 || x % 4 == 1) {
11                    x = x - 1;
12                } 
13                else {
14                    x = x + 1;
15                }
16            }
17            count++;
18        }
19        return count;
20    }
21}