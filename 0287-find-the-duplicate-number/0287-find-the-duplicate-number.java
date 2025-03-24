class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();

        int n = nums.length;


        for(int arr : nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }

        for(int arr:nums){
            if(mp.get(arr)>=2){
                return arr;
            }

        }
        return -1;

        
    }
}