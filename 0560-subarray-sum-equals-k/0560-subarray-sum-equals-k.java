class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove = preSum-k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
        
    }
}