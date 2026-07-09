// Last updated: 7/9/2026, 9:52:54 AM
 class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char smallest = 'z';
        boolean thereIsSmallest = false;
        for(char c : letters) {
            if(c > target && c <= smallest) {
                thereIsSmallest = true;
                smallest = c;
            }
        }
        return (thereIsSmallest) ? smallest : letters[0];
    }
}