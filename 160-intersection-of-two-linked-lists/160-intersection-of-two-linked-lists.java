/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode r=new ListNode();
        r=null;
        
        ListNode t1=headA;
        while(headA!=null){
            
        ListNode t2=headB;
            while(t2!=null){
                
                if(headA==t2){
                    return headA;
                }
                t2=t2.next;
            }
            headA=headA.next;
        }
        return null;
    }
}