/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode currentNode = head;
        ListNode nextNode;
        ListNode headNode;
        if(currentNode == null)
        {
            return null;
        }
        
        while(currentNode!=null && currentNode.val==val)
        {
            currentNode=currentNode.next;
        }
        
        if(currentNode == null) return null;
        else nextNode = currentNode.next;
        
        headNode = currentNode;
       
        
        while(nextNode != null){
            
        if(nextNode.val == val)
        {
            currentNode.next=nextNode.next;
            nextNode=nextNode.next;
        }
        else{
            currentNode = currentNode.next;
            nextNode = nextNode.next;
        }
        
        }
        
            return headNode;
    }
}