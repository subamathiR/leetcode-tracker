// Last updated: 7/9/2026, 9:49:43 AM
import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        int f = -1;

        for(int v : map.values()){
            if(f == -1){
                f = v;
            }
            else if(f != v){
                return false;
            }
        }

        return true;
    }
}