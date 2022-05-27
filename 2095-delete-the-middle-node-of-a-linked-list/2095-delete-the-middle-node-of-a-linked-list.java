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
        if(head.next==null){
            return null;
        }
        int s=0;
        ListNode t=head;
        while(t!=null){
            s++;
            t=t.next;
        }
        int h;
        if(s%2==0){
            h=s/2;
        }
        else{
            h=(s-1)/2;
        }
        ListNode ht=head;
        ListNode temp=head;
        for(int i=0;i<h-1;i++){
            ht=ht.next;
            
        }
        ht.next=ht.next.next;
        
      
        return head;
       
    }
}