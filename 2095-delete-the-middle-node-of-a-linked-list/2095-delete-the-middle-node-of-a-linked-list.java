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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        if(head.next==null){
            return head.next;
        }
        
        int pos = cnt/2;
        cnt = 0;
        temp = head;
        while(cnt<pos-1){
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}