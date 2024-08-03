// class Solution {
//     public int maxProduct(int[] nums) {
        
//         int pre=1;
//         int suff=1;
//         int ans = Integer.MIN_VALUE;
//         int n = nums.length;
//         if (n == 0) return 0;
//         for(int i =0;i<n;i++){
//             if(pre==0) pre=1;
//             if(suff==0) suff=1;

//             pre=pre*nums[i];
//             suff=suff*nums[n-i-1];
//             ans= Math.max(ans,Math.max(pre,suff));
//         }
//         return ans;
//     }
// }
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // Handle empty array case

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct if the current number is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update result
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
