class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0,xor2=0;
        for(int i =0;i<nums.length;i++){
            xor1=nums[i]^xor1;
            xor2=xor2^i+1;

        }
        return xor1^xor2;


    }
}