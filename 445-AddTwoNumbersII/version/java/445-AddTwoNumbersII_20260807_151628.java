// Last updated: 8/7/2026, 3:16:28 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        Stack<Integer> s1 = new Stack<>();
14        Stack<Integer> s2 = new Stack<>();
15        while (l1 != null) {
16            s1.push(l1.val);
17            l1 = l1.next;
18        }
19        while (l2 != null) {
20            s2.push(l2.val);
21            l2 = l2.next;
22        }
23        int carry = 0;
24        ListNode dummy = null;
25        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
26            int sum = carry;
27            if (!s1.isEmpty())
28                sum += s1.pop();
29            if (!s2.isEmpty())
30                sum += s2.pop();
31            ListNode node = new ListNode(sum % 10);
32            node.next = dummy;
33            dummy = node;
34            carry = sum / 10;
35        }
36        return dummy;
37    }
38}