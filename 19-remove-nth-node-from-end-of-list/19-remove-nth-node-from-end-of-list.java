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
      
        ListNode t=head;
         ListNode r=head;
        int c=1;
        while(c<=n){
            t=t.next;
            c++;
        }
        if(t==null){
           return r.next; 
        }
        while(t.next!=null){
            t=t.next;
            r=r.next;
        }
        r.next=r.next.next;
        return head;
    }
}