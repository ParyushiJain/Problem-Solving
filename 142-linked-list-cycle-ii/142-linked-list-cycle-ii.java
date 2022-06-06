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
      
        if(head==null || head.next==null || head.next.next==null){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(f.next!=null && f.next.next!=null){
             f=f.next.next;
            s=s.next;
            if(f==s){
                f=head;
                while(f!=s){
                    f=f.next;
                    s=s.next;
                }
                return f;
            }
           
        }
        return null;
    }
}