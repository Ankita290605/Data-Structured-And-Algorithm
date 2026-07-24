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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> (a.val - b.val));

        for(ListNode temp : lists){
            
            while(temp!=null){
                pq.add(temp);
                temp = temp.next;
            }
        }
        ListNode head = dummy;
        while(!pq.isEmpty()){
            dummy.next = new ListNode(pq.poll().val);
            dummy = dummy.next;
        }

        return head.next;
    }
}