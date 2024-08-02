import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        // First pass: Find potential candidates
        for (int num : nums) {
            if (c1 == 0 && num != el2) {
                c1 = 1;
                el1 = num;
            } else if (c2 == 0 && num != el1) {
                c2 = 1;
                el2 = num;
            } else if (num == el1) {
                c1++;
            } else if (num == el2) {
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        // Second pass: Count actual occurrences of the candidates
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == el1) c1++;
            else if (num == el2) c2++;
        }

        // Prepare the result list
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        if (c1 > threshold) result.add(el1);
        if (c2 > threshold) result.add(el2);

        return result;
    }
}

///////////

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         Map<Integer, Integer> mpp = new HashMap<>();
//         int n = nums.length;
//         int threshold = n / 3;
        
//         // Count occurrences of each number
//         for (int num : nums) {
//             mpp.put(num, mpp.getOrDefault(num, 0) + 1);
//         }
        
//         // Collect numbers that exceed the threshold
//         for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
//             if (entry.getValue() > threshold) {
//                 ans.add(entry.getKey());
//             }
//         }
        
//         return ans;       
//     }
// }
