// Last updated: 10/3/2026, 9:49:27 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4        backtrack(res,"",0,0,n);
5        return res;
6    }
7    public void backtrack(List<String> res,String s,int o,int c,int n){
8        if(s.length() == 2*n){
9            res.add(s);
10            return;
11        }
12        if(o < n){
13            backtrack(res,s+"(",o+1,c,n);
14        }
15        if(c < o){
16            backtrack(res,s+")",o,c+1,n);
17        }
18        
19    }
20}