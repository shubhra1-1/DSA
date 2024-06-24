// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int maxi = nums[0];
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             if(sum<0){
//                 sum=0;
//             }
//             if(sum>maxi){
//                 maxi=sum;
//             }
//             // if(maxi<0){
//             //     maxi=0;
//             // }
            
//         }
//         return maxi;
        
//     }
// }
class Solution {
  public int maxSubArray(int[] nums) {
    int ans = Integer.MIN_VALUE;
    int sum = 0;

    for (final int num : nums) {
      sum = Math.max(num, sum + num);
      ans = Math.max(ans, sum);
    }

    return ans;
  }
}