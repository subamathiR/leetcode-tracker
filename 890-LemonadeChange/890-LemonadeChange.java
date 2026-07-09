// Last updated: 7/9/2026, 9:52:25 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c_5 = 0, c_10 = 0;
        for(int bill : bills){
            if(bill == 5){
                c_5++;
            }
            else if(bill == 10){
                if(c_5 >= 1){
                    c_5--;
                    c_10++;
                } else {
                    return false;
                }
            }
            else { // bill == 20
                if(c_10 >= 1 && c_5 >= 1){
                    c_10--;
                    c_5--;
                }
                else if(c_5 >= 3){
                    c_5 -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
