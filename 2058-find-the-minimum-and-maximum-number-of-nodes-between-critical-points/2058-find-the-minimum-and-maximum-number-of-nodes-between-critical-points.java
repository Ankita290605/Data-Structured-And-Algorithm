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
        ListNode prev = head;
        if(prev.next.next==null) return new int[]{-1, -1};
        ListNode curr = head.next;
        ListNode next = curr.next;
        int c = 2;
        List<Integer> arr = new ArrayList<>();
        while(next!=null){
            if((curr.val<prev.val && curr.val<next.val) || (curr.val>prev.val && curr.val>next.val)){
                arr.add(c);
            }
            c++;
            prev = curr;
            curr = next;
            next = next.next;
        }

        if (arr.size()<=1){
            return new int[]{-1, -1};
        }
    

        Collections.sort(arr);

        int ans[] = new int[2];

        int max = arr.get(arr.size()-1) - arr.get(0);
        int min = Integer.MAX_VALUE;

        for(int i=1;i<arr.size();i++){
            min = Math.min(min, arr.get(i) - arr.get(i-1));
        }

        ans[0] = min;
        ans[1] = max;

        return ans;


    }
}