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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        List<Integer> arr = new ArrayList<>();
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int end = arr.size()-1;
        int start = 0;
        while(start <= end){
            if(arr.get(start) != arr.get(end))
                return false;
            start ++;
            end--;
        }

        return true;
    }
}