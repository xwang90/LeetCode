/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
           if(head==null) return null;
           
           ListNode dummy=new ListNode(0);
           ListNode pre,cur,nxt;
           
           pre=dummy;
           dummy.next=head;
           cur=head;
           nxt=head;
           
           if(head.next!=null) nxt=head.next;
           else return head;
           
           boolean duplicate=false;
           
           while(nxt!=null)
           {
               if(nxt.val==cur.val) 
               {
                   nxt=nxt.next;
                   duplicate=true;
               }
               else if(nxt.val!=cur.val&&duplicate==true)
               {
                   pre.next=nxt;
                   cur=nxt;
                   nxt=nxt.next;
                   duplicate=false;
               }
               else if(nxt.val!=cur.val&&duplicate==false)
               {
                   pre=cur;
                   cur=nxt;
                   nxt=nxt.next;
               }
           }
           
           if(duplicate==true) pre.next=nxt;
           
           return dummy.next;
    }
}