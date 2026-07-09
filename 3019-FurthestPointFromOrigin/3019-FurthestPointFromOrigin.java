// Last updated: 7/9/2026, 9:47:52 AM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0,right = 0,blanks = 0;
        for(char c:moves.toCharArray()){
            if(c=='L') left++;
            else if(c=='R') right++;
            else blanks++;
        }
        return Math.abs(left-right)+blanks;
    }
}