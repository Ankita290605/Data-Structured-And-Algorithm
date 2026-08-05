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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(head!=null){
            if(head.val!=val){
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            }
            head = head.next;
        }

        return temp.next;
    }
}