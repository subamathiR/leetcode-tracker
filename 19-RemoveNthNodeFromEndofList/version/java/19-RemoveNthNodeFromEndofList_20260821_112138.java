// Last updated: 8/21/2026, 11:21:38 AM
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
12    public ListNode removeElements(ListNode head, int val) {
13        while(head != null && head.val == val){
14           head = head.next;
15        }
16        ListNode current = head;
17        while(current != null && current.next!=null){
18            if(current.next.val == val){
19                current.next = current.next.next;
20            }
21            else{
22                current = current.next;
23            }
24        }
25        return head;
26    }
27}