// Last updated: 7/9/2026, 9:51:06 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}