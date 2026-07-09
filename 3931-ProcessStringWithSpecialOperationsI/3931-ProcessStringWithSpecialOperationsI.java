// Last updated: 7/9/2026, 9:45:28 AM
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            }
            else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }
            else if (ch == '#') {
                String copy = result.toString();
                result.append(copy);
            }
            else if (ch == '%') {
                result.reverse();
            }
        }
        return result.toString();
    }
}