class Solution {
    public List<List<Integer>> findDifference(int[] arr1, int[] arr2) {   
        HashMap<Integer,Integer>mpp=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> k =new ArrayList<>();
        for(int i:arr2)
         mpp.put(i,1);
        for(int i:arr1)
        {
            if(!mpp.containsKey(i)){
            list.add(i);
            mpp.put(i,1);
            }
        }
        k.add(list); list=new ArrayList<>();
        mpp=new HashMap<>();
        for(int i:arr1)
        mpp.put(i,1);
        for(int i:arr2)
        {
            if(!mpp.containsKey(i)){
            list.add(i);
            mpp.put(i,1);
            }
        }
        k.add(list);
        return k;
    }
}