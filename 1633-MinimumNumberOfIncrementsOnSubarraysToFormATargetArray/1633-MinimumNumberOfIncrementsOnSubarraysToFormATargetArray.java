// Last updated: 7/9/2026, 9:50:40 AM
class Solution {
    public int minNumberOperations(int[] target) {
        final int n=target.length;
        int ans=target[0];
        for(int i=1; i<n; i++)
            ans+=Math.max(target[i]-target[i-1], 0);
        return ans;
    }
}