// Last updated: 7/9/2026, 9:50:17 AM
class Solution {
    public int minPartitions(String n) {
        int r = 0;
        for(int i = 0;i<n.length();i++){
            r = Math.max(r,n.charAt(i)-'0');
        }
        return r;
    }
}