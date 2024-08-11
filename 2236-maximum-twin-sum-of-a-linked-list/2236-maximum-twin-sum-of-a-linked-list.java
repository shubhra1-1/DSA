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
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        List<Integer> twinSums = new ArrayList<>();
        int start = 0;
        int end = values.size() - 1;
        while (start <= end) {
            twinSums.add(values.get(start++) + values.get(end--));
        }
        int maxTwinSum = 0;
        for (int sum : twinSums) {
            if (sum > maxTwinSum) {
                maxTwinSum = sum;
            }
        }
        return maxTwinSum;
    }
}