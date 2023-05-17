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
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null)
            return head;
        ListNode cur = head;
        ListNode next = head.next;
        while(next!=null){
            if(next.val == val && cur.val != val){
                cur.next = next.next;
                next = next.next;
            }
            else{
                cur = next;
                next = next.next;
            }
        }
        if(cur.val == val)
            cur = null;
        return head;
    }
}