/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null||k==0) return head;
         
         ListNode first=head;
         
         ListNode fast=head;
         ListNode slow=head;
         ListNode next=head;
         
         ListNode current=head;
         
         int length=0;
         
         while(current!=null)
         {
            current=current.next;
            length++;
         }
         
         int j=k%length;
         
         if(j==0) return head;
         
         for(int m=0;m<j;m++)
         {
             fast=fast.next;
         }
         
         while(fast!=null&&fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next;
         }
         
         next=slow.next;
         slow.next=null;
         fast.next=first;
         
         return next;
         
         
    }
}