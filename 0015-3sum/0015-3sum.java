import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to use two-pointer technique
        List<List<Integer>> res = new LinkedList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid redundant triplets
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int target = -nums[i];
                
                while (low < high) {
                    int sum = nums[low] + nums[high];
                    if (sum == target) {
                        // Add the triplet to the result list
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        
                        // Skip duplicate elements for the second and third numbers
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        
                        // Move pointers
                        low++;
                        high--;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return res;
    }
}
