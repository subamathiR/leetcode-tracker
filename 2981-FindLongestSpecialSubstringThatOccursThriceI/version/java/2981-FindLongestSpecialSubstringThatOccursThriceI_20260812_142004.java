// Last updated: 8/12/2026, 2:20:04 PM
1import java.util.*;
2public class Solution {
3    public int maximumLength(String s) {
4        Map<String, Integer> freq = new HashMap<>();
5        int n = s.length();
6        for (int i = 0; i < n;) {
7            int j = i;
8            while (j < n && s.charAt(j) == s.charAt(i)) {
9                j++;
10            }
11            int runLength = j - i;
12            char c = s.charAt(i);
13            for (int len = 1; len <= runLength; len++) {
14                String key = c + ":" + len; 
15                freq.put(key, freq.getOrDefault(key, 0) + (runLength - len + 1));
16            }
17            i = j;
18        }
19        int ans = -1;
20        for (String key : freq.keySet()) {
21            int count = freq.get(key);
22            int len = Integer.parseInt(key.split(":")[1]);
23            if (count >= 3) {
24                ans = Math.max(ans, len);
25            }
26        }
27        return ans;
28    }
29}
30