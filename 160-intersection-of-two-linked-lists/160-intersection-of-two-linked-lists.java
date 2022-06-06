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
       ListNode t1=headA;
      
        while(t1!=null){
              ListNode t2=headB;
            while(t2!=null){
              if(t1==t2){
                  return t1;
              }
                t2=t2.next;
                }
            t1=t1.next;
        }
        return null;
    }
}