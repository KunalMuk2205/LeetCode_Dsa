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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp1 = head;

        while(temp1!=null){
            count++;
            temp1 = temp1.next;
        }
        int result = count-n;

        if (result == 0) {
            return head.next;
        }

        ListNode temp2 = head;

        while(result>1){
            result--;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}