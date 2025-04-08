class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        Map <Integer,Integer> mp = new HashMap<>();

        for(int nums :arr){
            set.add( nums);

        }
        int rank=1;
        for(int maps : set){
            mp.put(maps,rank);
            rank++;

        }

        for(int i =0;i<arr.length;i++){
            arr[i]= mp.get(arr[i]);
        }
        return arr;
    }
}