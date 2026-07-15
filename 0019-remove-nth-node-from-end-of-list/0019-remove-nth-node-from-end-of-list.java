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
        ListNode temp = head;
        int cnt = 0;
        
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        if(cnt==n) return head.next;
        
        int pos = cnt-n;
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