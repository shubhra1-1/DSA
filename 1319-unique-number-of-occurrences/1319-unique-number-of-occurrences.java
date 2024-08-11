class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(arr.length);
        Set<Integer> set = new HashSet<>(arr.length);
        for (int i : arr) {
            Integer count = map.get(i);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(i, count);
        }
        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
    }
}