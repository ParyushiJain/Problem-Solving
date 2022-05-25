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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        c+=1;
        System.out.println(c);
        if(c%2==1){
            for(int i=0;i<=((c-1)/2)-1;i++){
                head=head.next;
            }
        }
        else{
            for(int i=0;i<c/2;i++){
                head=head.next;
            }
        }
     return head;
    }
}