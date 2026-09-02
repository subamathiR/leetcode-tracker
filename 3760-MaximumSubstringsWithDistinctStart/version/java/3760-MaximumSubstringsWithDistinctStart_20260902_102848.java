// Last updated: 9/2/2026, 10:28:48 AM
1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int c = 0;
5        for(char ch : s.toCharArray()){
6            set.add(ch);
7        }
8        for(char ch : set){
9            c++;
10        }
11        return c;
12    }
13}