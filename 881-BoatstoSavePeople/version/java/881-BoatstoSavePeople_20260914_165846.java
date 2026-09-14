// Last updated: 9/14/2026, 4:58:46 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int i = 0;
5        int j = people.length-1;
6        int c = 0;
7        while(i <= j){
8            if(people[i] + people[j] <= limit){
9                i++;
10                j--;
11            }
12            else{
13                j--;
14            }
15            c++;
16        }
17        return c;
18    }
19}