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

    public ListNode findNode(ListNode temp, int k){
        int count=1;
        while(temp!=null){
            if(count==k) return temp;
            temp=temp.next;
            count++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {

        

        if(head==null || head.next==null) return head;

        ListNode tail = head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        if(k%len==0) return head;

        k=k%len;
        tail.next=head;
        ListNode lastNewNode = findNode(head, len-k);
        head=lastNewNode.next;
        lastNewNode.next=null;
        return head; 
        
    }
}