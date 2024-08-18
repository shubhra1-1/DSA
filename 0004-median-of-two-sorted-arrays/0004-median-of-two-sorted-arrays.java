class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++){
            answer.add(nums1[i]);
        }
        for (int i = 0; i < m; i++){
            answer.add(nums2[i]);
        }
        int size = answer.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = answer.get(i);
        }
        Arrays.sort(result);
        if (size % 2 == 1){
            return result[size / 2];
        }
        return (result[(size / 2) - 1] + result[size / 2]) / 2.0;
    }
}