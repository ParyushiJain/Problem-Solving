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
    public static ListNode rev(ListNode head){
        ListNode p=null;
        while(head!=null){
            ListNode nx=head.next;
            head.next=p;
            p=head;
            head=nx;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
      if(head==null || head.next==null){
          return true;
      }
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        s.next=rev(s.next);
        s=s.next;
        ListNode c=head;
        while(s!=null){
            if(c.val!=s.val){
                return false;
            }
            c=c.next;
            s=s.next;
        }
        return true;
    }
}