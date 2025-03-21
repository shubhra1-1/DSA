class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
        int i=0;
       
            for(int j =i+1;j<n;j++){
                if(nums[j]!=nums[i]){
                    int temp = nums[j];
                    nums[j]=nums[i+1];
                    nums[i+1]=temp;
                    i++;
                }
            
            }
        return i+1;
    }
}