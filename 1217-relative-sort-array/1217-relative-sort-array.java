class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int arr : arr1){
            mp.put(arr, mp.getOrDefault(arr,0)+1);
        }

        int index=0;

        for(int arr:arr2){
            while(mp.getOrDefault(arr,0)>0){
                arr1[index]=arr;
                index++;
                mp.put(arr,mp.get(arr)-1);


            }
            mp.remove(arr);
        }

        //remaining elements
        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            while(entry.getValue()>0){
                res.add(entry.getKey());
                entry.setValue(entry.getValue()-1);
            }
        }

        Collections.sort(res);

        for(int arr:res){
            arr1[index++]=arr;
        }
        return arr1;
    }
}