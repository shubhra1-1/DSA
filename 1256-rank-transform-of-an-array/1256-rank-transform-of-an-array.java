class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> set = new TreeSet<>();

        //put elements of array in treeset
        for(int num : arr ){
            set.add(num);
        }
        int rank=1; //bcoz rank start from 1
        //put set elements in map
        for(int maps: set){
            mp.put(maps,rank);
            rank++;

        }
        for(int i =0;i<arr.length;i++){
            arr[i]= mp.get(arr[i]);
        }
        return arr;
    }
}