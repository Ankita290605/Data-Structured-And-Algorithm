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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ListNode curr = head;
        while(curr!=null){
            map.put(curr.val, map.getOrDefault(curr.val, 0)+1);
            curr = curr.next;
        }

        for(int ele : map.keySet()){
            if(map.get(ele)==1){
                dummy.next = new ListNode(ele);
                dummy = dummy.next;
            }
        }

        return t.next;
    }
}