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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1!=null){
            list.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            list.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(list);
        return convert(list);
    }
    public ListNode convert(List<Integer> arr){
        if (arr.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;

        for(int i=1;i<arr.size();i++){
            ListNode temp = new ListNode(arr.get(i));
            current.next = temp;
            current = temp;
        }
        return head;
    }
}