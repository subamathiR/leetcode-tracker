// Last updated: 8/14/2026, 9:46:54 AM
1class Solution {
2    public int[] sortEvenOdd(int[] nums) {
3        ArrayList<Integer> even = new ArrayList<>();
4        ArrayList<Integer> odd = new ArrayList<>();
5        for (int i = 0; i < nums.length; i++) {
6            if (i % 2 == 0) {
7                even.add(nums[i]);
8            } else {
9                odd.add(nums[i]);
10            }
11        }
12        Collections.sort(even);
13        Collections.sort(odd, Collections.reverseOrder());
14        int e = 0;
15        int o = 0;
16        for (int i = 0; i < nums.length; i++) {
17            if (i % 2 == 0) {
18                nums[i] = even.get(e++);
19            } else {
20                nums[i] = odd.get(o++);
21            }
22        }
23        return nums;
24    }
25}