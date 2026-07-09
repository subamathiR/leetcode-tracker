// Last updated: 7/9/2026, 9:45:10 AM
class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxi=0;
        maxi=Math.max(maxi,solve(s,1));
        maxi=Math.max(maxi,solve(s,2));
        maxi=Math.max(maxi,solve(s,3));
        maxi=Math.max(maxi,solve(s,4));
        maxi=Math.max(maxi,single(s,'a'));
        maxi=Math.max(maxi,single(s,'b'));
        maxi=Math.max(maxi,single(s,'c'));
        return maxi;
    }

    public int solve(String s,int type){
        Map<String,Integer>map=new HashMap<>();
        int a=0;
        int b=0;
        int c=0;
        int maxi=0;
        String initial=generate(0,0,0,type);
        map.put(initial,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a')a++;
            else if(ch=='b')b++;
            else c++;
            String encode=generate(a,b,c,type);
            if(map.containsKey(encode)){
                maxi=Math.max(maxi,i-map.get(encode));
            }
            else{
                map.put(encode,i);
            }
        }
        return maxi;
    }

    private String generate(int a,int b,int c,int type){
        switch(type){
            case 1:return (a-b)+"#"+(b-c);
            case 2:return (a-b)+"#"+c;
            case 3:return (a-c)+"#"+b;
            case 4:return (b-c)+"#"+a;
            default:return "";
        }
    }

    private int single(String s,char target){
        int maxi=0;
        int n=s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i)!=target){
                i++;
                continue;
            }
            int j=i;
            while(j<n && s.charAt(j)==target)j++;
            maxi=Math.max(maxi,j-i);
            i=j;
        }
        return maxi;
    }
}