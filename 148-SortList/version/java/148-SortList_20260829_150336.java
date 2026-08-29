// Last updated: 8/29/2026, 3:03:36 PM
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
12    public ListNode sortList(ListNode head) {
13        ArrayList<Integer> list = new ArrayList<>();
14        ListNode temp = head;
15        while (temp != null) {
16            list.add(temp.val);
17            temp = temp.next;
18        }
19        Collections.sort(list);
20        temp = head;
21        int i = 0;
22        while (temp != null) {
23            temp.val = list.get(i);
24            i++;
25            temp = temp.next;
26        }
27        return head;
28    }
29}