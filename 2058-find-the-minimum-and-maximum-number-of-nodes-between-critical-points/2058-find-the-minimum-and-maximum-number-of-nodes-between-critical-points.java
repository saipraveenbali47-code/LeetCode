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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list = new ArrayList<>();
        // if(head == null || head.next == null) return ;
        ListNode prev = head;
        ListNode current = head.next;
        int pos = 1;
        while(current.next != null){
            ListNode next = current.next;
            if((current.val > prev.val && current.val > next.val) || (current.val < prev.val && current.val < next.val)) list.add(pos);
            pos ++;
            prev = current;
            current = current.next;
        }
        if(list.size() < 2) return new int[]{-1, -1};
        int max = list.get(list.size() - 1) - list.get(0);
        int minDis = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i ++){
            minDis = Math.min(minDis, (list.get(i) - list.get(i - 1)));
        }
        return new int[]{minDis, max};
    }
}