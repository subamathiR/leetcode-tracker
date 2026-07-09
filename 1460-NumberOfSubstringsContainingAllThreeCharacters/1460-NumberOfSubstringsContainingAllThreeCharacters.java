// Last updated: 7/9/2026, 9:51:09 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int f[] = new int[3];
        int l = 0;
        int res = 0;
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'a']++;
            while(f[0] > 0 && f[1] > 0 && f[2] > 0){
                res+=s.length()-r;
                f[s.charAt(l)-'a']--;
                l++;
            }
        }
        return res;
    }
}