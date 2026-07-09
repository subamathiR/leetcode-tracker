// Last updated: 7/9/2026, 9:51:36 AM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String words[]=text.split(" ");
        int count = 0;
        for(String word : words)
        {
            boolean a = true;
            for(char c:brokenLetters.toCharArray())
            {
                if(word.indexOf(c)!=-1)
                {
                    a=false;
                    break;
                }
            }
            if(a)
            count++;
        }
        return count;
    }
}