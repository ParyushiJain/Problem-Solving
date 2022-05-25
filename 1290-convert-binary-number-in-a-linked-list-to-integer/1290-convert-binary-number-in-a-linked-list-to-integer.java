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
    public int getDecimalValue(ListNode head) {
          String k="";
        while(head.next!=null){
         
            k+=Integer.toString(head.val);
            head=head.next;
            
        }
        k+=Integer.toString(head.val);
        int s=Integer.parseInt(k,2); 
        
        return s;
    }
}