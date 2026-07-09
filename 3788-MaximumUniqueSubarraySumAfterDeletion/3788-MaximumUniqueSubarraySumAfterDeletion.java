// Last updated: 7/9/2026, 9:46:05 AM
 import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int result = 0;
        for (int num : set) {
            if (num > 0) result += num;
        }

        if (result == 0) {
            result = Collections.max(set);
        }

        return result;
    }
}