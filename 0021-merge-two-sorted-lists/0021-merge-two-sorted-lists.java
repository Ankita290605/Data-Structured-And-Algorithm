class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d = new ListNode(-1);
        ListNode c = d;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                c.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                c.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            c = c.next;
        }

        while (list1 != null) {
            c.next = new ListNode(list1.val);
            list1 = list1.next;
            c = c.next;
        }

        while (list2 != null) {
            c.next = new ListNode(list2.val);
            list2 = list2.next;
            c = c.next;
        }

        return d.next;
    }
}
