import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        
        // Process the first window
        for (int i = 0; i < k; ++i) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i); // deque ->>> 1,2,3
                                             //removelast
        }                              //1,2
                                            //addlast
                                       //1,2,3     
        
        // Process the rest of the windows
        for (int i = k; i < n; ++i) {
            result[i - k] = nums[dq.peek()];

            // Remove elements out of the window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }

            // Remove elements smaller than the current element
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }
        
        // Add the maximum for the last window
        result[n - k] = nums[dq.peek()];

        return result;
    }
}
