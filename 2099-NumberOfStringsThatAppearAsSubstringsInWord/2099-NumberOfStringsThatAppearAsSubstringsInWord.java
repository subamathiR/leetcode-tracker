// Last updated: 7/9/2026, 9:49:32 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for(int i=0;i<patterns.length;i++){
           if(word.contains(patterns[i])){
            c++;
           }
        }
        return c;
    }
}