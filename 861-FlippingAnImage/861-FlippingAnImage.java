// Last updated: 7/9/2026, 9:52:30 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
    for (int i = 0; i < image.length; i++) {
        int s = 0;
        int e = image[i].length - 1;

        while (s <= e) {
             
            int t = image[i][s] ^ 1;
            image[i][s] = image[i][e] ^ 1;
            image[i][e] = t;

            s++;
            e--;
        }
    }
    return image;
}  }
 