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
       
        
        ListNode r=new ListNode(-1,null);
        ListNode rt=r;
        while(head!=null){
            if(head.val!=val){
           rt.next=head;
                rt=rt.next;
            }
            head=head.next;
        }
        rt.next=null;
        return r.next;
    }
}