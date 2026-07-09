// Last updated: 7/9/2026, 9:50:56 AM
class Solution {
    public int maxPower(String s) {
        int maxpower = 1;
        int count = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else{
                maxpower = Math.max(maxpower,count);
                count = 1;
            }
        }
        maxpower = Math.max(maxpower,count);
        return maxpower;
    }
}