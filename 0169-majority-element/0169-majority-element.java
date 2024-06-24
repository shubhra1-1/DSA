class Solution {
    public int majorityElement(int[] nums) {
        int element=0;
        int cnt=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                //start with the new section
                element=nums[i];
                cnt=1;
            }
            else if(nums[i]==element){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return element;
        
    }
}