class Solution {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by spaces
        String[] words = s.split("\\s+");
        
        // Reverse the words array
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        // Join the reversed words back into a single string
        return String.join(" ", words);
    }
}
