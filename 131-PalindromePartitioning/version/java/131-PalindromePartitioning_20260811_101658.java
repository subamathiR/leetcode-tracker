// Last updated: 8/11/2026, 10:16:58 AM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7    public void backtrack(
8        String s,
9        int start,
10        List<String> current,
11        List<List<String>> result) {
12        if (start == s.length()) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16        for (int end = start; end < s.length(); end++) {
17            if (isPalindrome(s, start, end)) {
18                current.add(s.substring(start, end + 1));
19                backtrack(s, end + 1, current, result);
20                current.remove(current.size() - 1);
21            }
22        }
23    }
24    public boolean isPalindrome(String s, int left, int right) {
25        while (left < right) {
26            if (s.charAt(left) != s.charAt(right)) {
27                return false;
28            }
29            left++;
30            right--;
31        }
32        return true;
33    }
34}