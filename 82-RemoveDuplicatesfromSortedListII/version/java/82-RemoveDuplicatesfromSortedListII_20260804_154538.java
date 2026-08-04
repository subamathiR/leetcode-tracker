// Last updated: 8/4/2026, 3:45:38 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null || head.next == null)
14            return head;
15        ListNode fake = new ListNode(0);
16        fake.next = head;
17        ListNode curr = fake;
18        while(curr.next != null && curr.next.next != null){         
19            if(curr.next.val == curr.next.next.val) {
20                int duplicate = curr.next.val;
21                while(curr.next !=null && curr.next.val == duplicate) {
22                    curr.next = curr.next.next;
23                }
24            }
25            else{
26                curr = curr.next;
27            }
28        }
29        return fake.next;     
30    }
31}