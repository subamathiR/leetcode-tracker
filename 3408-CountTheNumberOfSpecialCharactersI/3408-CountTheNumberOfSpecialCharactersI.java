// Last updated: 7/9/2026, 9:47:19 AM
class Solution {
    public int numberOfSpecialChars(String word) {
       HashSet<Character> set = new HashSet<>();
       for(char ch : word.toCharArray()){
        set.add(ch);
       }
       int c = 0;
       for(char ch = 'a';ch <= 'z';ch++){
        if(set.contains(ch) && set.contains(Character.toUpperCase(ch))){
            c++;
        }
       }
       return c;
    }
}