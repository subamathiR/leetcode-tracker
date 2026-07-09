// Last updated: 7/9/2026, 9:45:02 AM
class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long x = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int d = s.charAt(i)-'0';
           if(d == 0)
           continue;
           x = x*10 + d;
           sum+=d;
        }
        return x*sum;
    }
}