/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||m==n) return head;
        
        ListNode dummy=new ListNode(0);
        ListNode pre,cur,nxt,preStart,start,end;
        int i=0;
        
        pre=dummy;
        cur=head;
        preStart=dummy;
        start=dummy;
        end=dummy;
        dummy.next=head;
        
        if(head.next!=null) nxt=head.next;
        else return head;
        
        while(i<n)
        {
           if(m==1) preStart=dummy;
           else if(i==m-2) preStart=cur;
           
           if(i==m-1) start=cur;
           
           if(i==n-1) end=cur;
           
           if(i>=m)
           {
              cur.next=pre;
              pre=cur;
              cur=nxt;
              
              if(nxt!=null)
              nxt=nxt.next;
           }
           else
           {
               pre=cur;
               cur=nxt;
               
               if(nxt!=null)
               nxt=nxt.next;
           }
           
           i++;
        }
        
           preStart.next=end;
           start.next=cur;
           
           return dummy.next;
        
    }
}