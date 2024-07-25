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
    public ListNode mergeLL(ListNode l1 , ListNode l2){
        ListNode dNode = new ListNode(-1);
        ListNode temp=dNode;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                temp=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                temp=l2;
                l2=l2.next;
            }
            if(l1!=null) temp.next=l1;
            else temp.next=l2;
        }
        return dNode.next;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)  return head;
        ListNode middle = findMiddle(head);
        ListNode leftHead=head;
        ListNode rightHead=middle.next;
        middle.next=null;

        leftHead= sortList(leftHead);
        rightHead= sortList(rightHead);

        return mergeLL(leftHead,rightHead);

    }
}