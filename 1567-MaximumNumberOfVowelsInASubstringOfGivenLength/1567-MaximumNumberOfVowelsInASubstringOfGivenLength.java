// Last updated: 7/9/2026, 9:50:52 AM
class Solution {
    public static boolean isvowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int v = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
           if(isvowels(s.charAt(i))){
            v++;
           }
           if(i>=k){
            if(isvowels(s.charAt(i-k))){
                v--;
            }
           }
           max = Math.max(max,v);
        }
        return max;
    }
}