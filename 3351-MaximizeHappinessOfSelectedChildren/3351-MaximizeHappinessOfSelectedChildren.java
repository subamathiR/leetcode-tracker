// Last updated: 7/9/2026, 9:47:26 AM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long t = 0;
        int d = 0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=0 && k>0 ;i--)
        {
            int c = happiness[i]-d;
            if(c>0)
            {
                t+=c;
            }
            d++;
            k--;
        }
        return t;
    }
}