// Last updated: 7/9/2026, 9:52:36 AM
class Solution {
    public boolean rotateString(String s, String goal) {
         if(s.length()!=goal.length())
         {
            return false;
         }
         String a = s+s;
         return a.contains(goal);
    }
}