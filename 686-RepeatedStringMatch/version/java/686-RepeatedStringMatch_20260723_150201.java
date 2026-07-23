// Last updated: 7/23/2026, 3:02:01 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        StringBuilder sb = new StringBuilder(a);
4        int count = 1;
5        while(sb.length() < b.length()){
6            sb.append(a);
7            count++;
8        }
9        if(sb.toString().contains(b))
10            return count;
11        else
12            sb.append(a);
13        
14        if(sb.toString().contains(b))
15        return count+1;
16        return -1;
17    }
18}