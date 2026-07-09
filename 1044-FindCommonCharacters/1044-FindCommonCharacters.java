// Last updated: 7/9/2026, 9:51:53 AM
import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int count[] = new int[26];
        
        // Initialize count from first word
        for (char c : words[0].toCharArray()) {
            count[c - 'a']++;
        }
        
        // Loop through the remaining words one by one
        for (int i = 1; i < words.length; i++) {
            int temp[] = new int[26];
            for (char c : words[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                if (temp[j] < count[j]) {
                    count[j] = temp[j];
                }
            }
        }
        
        // Build result list from min frequency counts
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                result.add(Character.toString((char) (i + 'a')));
                count[i]--;
            }
        }
        
        return result;
    }
}

  
      