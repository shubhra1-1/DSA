class Solution {
  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next!= null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode newHead= reverse(slow.next);
    ListNode first=head;
    ListNode sec= newHead;

    while(sec!=null){
        if(first.val!=sec.val){
            reverse(newHead);
            return false;
        }

        first=first.next;
        sec=sec.next;
        
    }
    reverse(newHead);
    return true;
  }

 static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
    while(head!=null){
        ListNode next= head.next;
        head.next=prev;
        prev=head;
        head=next;
    }
    return prev;


    }
}