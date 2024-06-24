class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
        return null;
        ListNode temp=head;
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        
        int count=0;

        
        for(int i =0;i<k;i++){
            if(current==null){
                return head;
            }
            current=current.next;
        }

        while(count<k && temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            count++;
        }
    if(next!=null){
        head.next=reverseKGroup(next,k);
    }
    return prev;     
    }  

}