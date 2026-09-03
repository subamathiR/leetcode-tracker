// Last updated: 9/3/2026, 12:02:03 PM
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        HashSet<String> ban = new HashSet<>();
4        for (String s : banned)
5            ban.add(s);
6        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
7        HashMap<String, Integer> map = new HashMap<>();
8        String ans = "";
9        int max = 0;
10        for (String word : paragraph.split(" ")) {
11            if (word.isEmpty() || ban.contains(word))
12                continue;
13            int count = map.getOrDefault(word, 0) + 1;
14            map.put(word, count);
15            if (count > max) {
16                max = count;
17                ans = word;
18            }
19        }
20        return ans;
21    }
22}
23
24