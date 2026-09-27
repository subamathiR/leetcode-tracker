// Last updated: 9/27/2026, 1:16:24 PM
1class Solution {
2    public boolean checkAlmostEquivalent(String word1, String word2) {
3        int f[] = new int[256];
4        for(char ch : word1.toCharArray()){
5            f[ch]++;
6        }
7        for(char ch : word2.toCharArray()){
8            f[ch]--;
9        }
10        for(int i=0;i<256;i++){
11            if(Math.abs(f[i])>3)
12                return false;
13
14        }
15        return true;
16    }
17}