class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the list of numbers
        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            // Calculate the complement
            int complement = target - num;
            
            // Check if the complement is already in the HashMap
            if (numToIndex.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[] { numToIndex.get(complement), index };
            }
            
            // Add the current number and its index to the HashMap
            numToIndex.put(num, index);
        }
        
        // If no solution is found, return an empty array (or throw an exception based on requirements)
        return new int[] {};
    }
    
}