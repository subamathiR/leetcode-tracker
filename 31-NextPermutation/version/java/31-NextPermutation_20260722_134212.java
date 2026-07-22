// Last updated: 7/22/2026, 1:42:12 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int ind1=-1;
4        int ind2=-1;
5        for(int i=nums.length-2;i>=0;i--){
6            if(nums[i]<nums[i+1]){
7                ind1=i;
8                break;
9            }
10        }
11        if(ind1==-1){
12            reverse(nums,0);
13        }    
14        else{
15            for(int i=nums.length-1;i>=0;i--){
16                if(nums[i]>nums[ind1]){
17                    ind2=i;
18                    break;
19                }
20            }
21            swap(nums,ind1,ind2);
22            reverse(nums,ind1+1);
23        }
24    }
25    void swap(int[] nums,int i,int j){
26        int temp=nums[i];
27        nums[i]=nums[j];
28        nums[j]=temp;
29    }
30    void reverse(int[] nums,int start){
31        int i=start;
32        int j=nums.length-1;
33        while(i<j){
34            swap(nums,i,j);
35            i++;
36            j--;
37        }
38    }
39}