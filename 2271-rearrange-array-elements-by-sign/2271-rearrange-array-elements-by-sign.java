class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length];
        int neg[] = new int[nums.length];
        int res[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg[negIndex++] = nums[i];
            } else {
                pos[posIndex++] = nums[i];
            }
        }

        int k = 0;
        // Alternate between positive and negative numbers
        posIndex = 0;  // Reset posIndex
        negIndex = 0;  // Reset negIndex
        while (posIndex < pos.length && negIndex < neg.length && k<nums.length) {
            
            res[k++] = pos[posIndex++]; 
            res[k++] = neg[negIndex++];  
            
            
            
        }

        // Fill remaining positive numbers if any
        while (posIndex < pos.length &&  k<nums.length) {
            res[k++] = pos[posIndex++];
        }

        // Fill remaining negative numbers if any
        while (negIndex < neg.length && k<nums.length) {
            res[k++] = neg[negIndex++];
        }

        return res;
    }
}
