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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode agla = null;
            while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    //    if(head==null || head.next==null) return false;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList(slow.next);
        ListNode t1 = head;
        ListNode t2 = temp;
        while(t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;
            }
        }
         return true;
       
    }
}