class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        // Edge cases
        if (high == 0) return nums[0]; // Only one element
        if (nums[0] != nums[1]) return nums[0]; // First element is unique
        if (nums[high] != nums[high - 1]) return nums[high]; // Last element is unique

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the unique element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Determine which side to search
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Default return value if no unique element is found
    }
}
