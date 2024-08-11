class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            // If there is only one element, it is the peak
            return 0;
        }
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak element
            if (mid > 0 && mid < n - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid + 1] > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } 
            // Handle edge cases for mid = 0 or mid = n - 1
            else if (mid == 0) {
                if (nums[0] > nums[1]) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mid == n - 1) {
                if (nums[n - 1] > nums[n - 2]) {
                    return n - 1;
                } else {
                    return n - 2;
                }
            }
        }
        return -1;
    }
}
