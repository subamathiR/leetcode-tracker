You are given an integer array nums.

The digit range of an integer is defined as the difference between its largest digit and smallest digit.

For example, the digit range of 5724 is 7 - 2 = 5.

Return the sum of all integers in nums whose digit range is equal to the maximum digit range among all integers in the array.

 
Example 1:


Input: nums = [5724,111,350]

Output: 6074

Explanation:

inums[i]LargestSmallestDigit Range0572472511111102350505

The maximum digit range is 5. The integers with this digit range are 5724 and 350, so the answer is 5724 + 350 = 6074.


Example 2:


Input: nums = [90,900]

Output: 990

Explanation:

inums[i]LargestSmallestDigit Range0909091900909

The maximum digit range is 9. Both integers have this digit range, so the answer is 90 + 900 = 990.


 
Constraints:


	1 <= nums.length <= 100
	10 <= nums[i] <= 105

