/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return  head;
        int n = 0;
        ListNode temp = head;
        while(temp != null){n++; temp = temp.next;}
        for(int i = 1; i <= k % n; i ++){
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null && curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            curr.next = head;
            head = curr;
            prev.next = null;
        }
        return head;
    }
}