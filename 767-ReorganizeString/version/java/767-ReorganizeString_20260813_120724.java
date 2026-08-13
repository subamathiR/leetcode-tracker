// Last updated: 8/13/2026, 12:07:24 PM
1class Solution {
2    public String reorganizeString(String s) {
3        int n = s.length();
4        int[] count = new int[26];
5        for (int i = 0; i < n; i++) {
6            count[s.charAt(i) - 'a']++;
7        }
8        int max = 0;
9        for (int i = 1; i < 26; i++) {
10            if (count[i] > count[max]) {
11                max = i;
12            }
13        }
14        if (count[max] > (n + 1) / 2) {
15            return "";
16        }
17        char[] result = new char[n];
18        int index = 0;
19        while (count[max] > 0) {
20            result[index] = (char) (max + 'a');
21            index += 2;
22            count[max]--;
23        }
24        for (int i = 0; i < 26; i++) {
25            while (count[i] > 0) {
26                if (index >= n) {
27                    index = 1;
28                }
29                result[index] = (char) (i + 'a');
30                index += 2;
31                count[i]--;
32            }
33        }
34        return new String(result);
35    }
36}