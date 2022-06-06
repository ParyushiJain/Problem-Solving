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
       ListNode t2=headB;
       HashMap<ListNode,Integer> hm=new HashMap<ListNode,Integer>();
        while(t1!=null){
            hm.put(t1,t1.val);
            t1=t1.next;
        }
        while(t2!=null){
            if(hm.containsKey(t2)){
                return t2;
            }
            else{
                hm.put(t2,t2.val);
                t2=t2.next;
            }
        }
        return null;
    }
}