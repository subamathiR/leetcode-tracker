// Last updated: 9/2/2026, 11:49:36 AM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        HashSet<Character> set = new HashSet<>();
4        for(char ch : sentence.toCharArray()){
5            set.add(ch);
6        }
7         return set.size()==26;
8    }
9}