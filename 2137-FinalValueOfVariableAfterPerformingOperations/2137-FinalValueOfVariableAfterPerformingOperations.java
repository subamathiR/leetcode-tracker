// Last updated: 7/9/2026, 9:49:27 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String c:operations){
            if(c.equals("--X")||c.equals("X--"))x--;
            else x++;
        }
        return x;
    }
}