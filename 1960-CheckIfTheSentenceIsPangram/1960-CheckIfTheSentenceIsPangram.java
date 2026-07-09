// Last updated: 7/9/2026, 9:49:57 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int count[] = new int[26];
        for(int i=0;i<n;i++)
        {
            char ch = sentence.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                count[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}