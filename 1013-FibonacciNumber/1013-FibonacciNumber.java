// Last updated: 7/9/2026, 9:51:56 AM
class Solution {
    public int fib(int n) {
        int f1 = 0;
        int f2=1;
        for(int i=0;i<n;i++)
        {
             
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;

        }
         return f1;
        
    }
}