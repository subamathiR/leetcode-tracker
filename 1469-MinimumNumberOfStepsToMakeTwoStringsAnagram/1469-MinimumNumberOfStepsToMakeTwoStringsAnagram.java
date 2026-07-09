// Last updated: 7/9/2026, 9:51:04 AM
import java.util.HashMap;
class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int c = 0; 
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1); 
            } else {
                c++; 
            }
        }
        return c;
    }
}
