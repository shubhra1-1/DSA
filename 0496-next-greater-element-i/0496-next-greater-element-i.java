class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        Stack <Integer> st = new Stack<>();
        HashMap<Integer,Integer> mpp= new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<= nums2[i]){
               mpp.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i : st){
            mpp.put(i,-1); //left out elements that do not have nge;
        }

        for(int i=0;i<nums1.length;i++){
            res[i]=mpp.get(nums1[i]);
        }
        
        return res;

        
    }
}