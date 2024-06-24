class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // Initialize j to 0
        int n = nums.length; // Update n to the length of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i != j) { // Avoid unnecessary swaps when i equals j
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
