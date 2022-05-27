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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if(list1==null && list2==null){
        //     return list1;
        // }
        // if(list1==null){
        //     return list2;
        // }
        // if(list2==null){
        //     return list1;
        // }
         ListNode head = new ListNode();
        ListNode r= new ListNode();
        head.next = r;

      
        while(list1!=null || list2!=null ){
            if(list1==null && list2!=null) {
                r.next = list2;
                r=r.next;
                list2=list2.next;
            }
            else if(list2==null && list1!=null) {
                r.next = list1; 
                r = r.next;
                
                list1=list1.next;
            }
            else if(list1.val<list2.val){
                r.next=list1;
                list1=list1.next;
                r=r.next;
            }
            else{
                r.next=list2;
                list2=list2.next; 
                r=r.next;
            }
            
            
            
        }
        return head.next.next;
    }
}