// Last updated: 7/9/2026, 9:52:12 AM
import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
     Map<Integer,Integer> map = new HashMap<>();
       int l = 0;
       int max = 0;
       for(int r = 0;r<fruits.length;r++){
        map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
        if(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);
            if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
            }
            l++;
        }
        max = Math.max(max,r-l+1);
       }
       return max;
    }
}