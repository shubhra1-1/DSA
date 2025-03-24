class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer,Integer> mp = new HashMap<>();
        //iterrate over arr1
        for(int arr : arr1){
            mp.put(arr, mp.getOrDefault(arr,0)+1);
        }
        
        int index=0;
        //iterate over arr2
        for(int arr:arr2){

            while(mp.getOrDefault(arr,0)>0){
                arr1[index]=arr;
                index++;
                mp.put(arr, mp.get(arr)-1);
            }
            mp.remove(arr);
        }
        //collect remaining elements that are only present in arr1
        List<Integer> res= new ArrayList<>();
        for(Map.Entry <Integer,Integer> entry : mp.entrySet()){
            while(entry.getValue()>0){
                res.add(entry.getKey());
                entry.setValue(entry.getValue()-1);
            } //[7,19] only 

        }
        Collections.sort(res);

        //now put [7,19] in A1
        for(int arr:res){
            arr1[index]=arr;
            index++;
        }

        return arr1;
    }
}