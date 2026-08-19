// Last updated: 8/19/2026, 2:56:17 PM
1import java.util.*;
2class Solution {
3    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
4        Map<Integer, Set<Integer>> map = new HashMap<>();
5        for (int[] seat : reservedSeats) {
6            map.computeIfAbsent(seat[0], k -> new HashSet<>()).add(seat[1]);
7        }
8        int ans = (n - map.size()) * 2;
9        for (Set<Integer> seats : map.values()) {
10            boolean left = true;   
11            boolean middle = true; 
12            boolean right = true;  
13            for (int seat : seats) {
14                if (seat >= 2 && seat <= 5)
15                    left = false;
16                if (seat >= 4 && seat <= 7)
17                    middle = false;
18                if (seat >= 6 && seat <= 9)
19                    right = false;
20            }
21            if (left && right) {
22                ans += 2;
23            } 
24            else if (left || middle || right) {
25                ans += 1;
26            }
27        }
28        return ans;
29    }
30}