class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp= new HashMap<>();

        for(int num:nums){
            if(mp.containsKey(num)){
            return num;
        }
        else{
            mp.put(num,1);
        }

        }
        
        return -1;
    }
}