// Last updated: 7/9/2026, 9:52:08 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        // int n = s.length();
        // StringBuilder sb = new StringBuilder(s);
        // String a = sb.reverse().toString();
        // return a;
        char ch[] = s.toCharArray();
        int i=0;
        int j=ch.length-1;;
        while(i<j)
        {
            if(!Character.isLetter(ch[i]))
            i++;
            else if(!Character.isLetter(ch[j]))
            j--;
            else{
            char t = ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
            }

        }
        return new String(ch);
    }
}