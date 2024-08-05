class Solution {
    public String[] divideString(String s, int k, char fill) {
        // Create a StringBuilder to manipulate the string
        StringBuilder sb = new StringBuilder(s);
        
        // Pad the string if its length is not a multiple of k
        while (sb.length() % k != 0) {
            sb.append(fill);
        }
        
        // Create an array to hold the result substrings
        String[] ans = new String[sb.length() / k];
        
        // Populate the result array with substrings of length k
        int index = 0;
        for (int i = 0; i < sb.length(); i += k) {
            ans[index++] = sb.substring(i, i + k);
        }
        
        return ans;
    }
}
