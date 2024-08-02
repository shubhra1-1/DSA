import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Convert string to character array
        char[] str = s.toCharArray();
        int strLen = str.length;
        
        // Create a hashmap to store frequency of characters
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < strLen; i++) {
            mpp.put(str[i], mpp.getOrDefault(str[i], 0) + 1);
        }
        
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mpp.entrySet());
        
        // Sort the list based on frequency in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char key = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++) {
                result.append(key);
            }
        }
        
        return result.toString();
    }
}
