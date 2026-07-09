// Last updated: 7/9/2026, 9:46:36 AM
class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < num.length(); i++){
            int d = num.charAt(i) - '0';

            if(i % 2 == 0){
                evenSum += d;
            }
            else{
                oddSum += d;
            }
        }

        return evenSum == oddSum;
    }
}