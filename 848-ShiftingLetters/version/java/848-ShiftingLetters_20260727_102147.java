// Last updated: 7/27/2026, 10:21:47 AM
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        long total = 0;
4        char[] arr = s.toCharArray();
5        for (int i = shifts.length - 1; i >= 0; i--) {
6            total = (total + shifts[i]) % 26;
7            arr[i] = (char)((arr[i] - 'a' + total) % 26 + 'a');
8        }
9        return new String(arr);
10    }
11}