class Solution {
     public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        int threshold = n / 3;
        
        // Count occurrences of each number
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        
        // Collect numbers that exceed the threshold
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() > threshold) {
                ans.add(entry.getKey());
            }
        }
        
        return ans;       
    }
}