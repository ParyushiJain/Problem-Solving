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
    public boolean hasCycle(ListNode head) {
      // HashMap<ListNode,Integer> hm=new HashMap<ListNode,Integer>();
      //   while(head!=null){
      //       if(hm.containsKey(head)){
      //           return true;
      //       }
      //       else{
      //           hm.put(head,head.val);
      //           head=head.next;
      //       }
      //   }
      //   return false;
        ListNode s=head,f=head;
        if(head==null || head.next==null || head.next.next==null)
        {
           return false; 
        }       
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;    
            if(s==f){
                return true;
            } 
        }
        return false;
    }
}