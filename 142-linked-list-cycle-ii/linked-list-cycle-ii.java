/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=detect(head);
        if(fast==null)
            return null;
        ListNode slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public ListNode detect(ListNode head){
        if(head==null || head.next==null)
            return null;
        ListNode fast=head, slow=head, x=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;  
            if(slow==fast)
                return fast;  
        }
        return null;
    }
}