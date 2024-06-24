class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode start=head;
        ListNode tail=head;
        ListNode temp=head;
        int len=0;
        if(head==null || head.next==null){
            return head;
        }
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
       
       int i=0;
       k=k%len;
       while(i<len-k-1){
        i++;
        start=start.next;
       }

       ListNode newnode= start.next;
       start.next=null;
       return newnode;
}
}