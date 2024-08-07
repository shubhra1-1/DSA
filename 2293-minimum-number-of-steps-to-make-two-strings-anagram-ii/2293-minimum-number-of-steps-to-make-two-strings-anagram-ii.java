class Solution {
    private int[] freqMap(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public int minSteps(String s, String t) {
        int[] freqS = freqMap(s);
        int[] freqT = freqMap(t);
        int ans = 0;

        for (int i = 0; i < 26; i++) {
            // Calculate the difference in frequency for each character
            ans += Math.abs(freqS[i] - freqT[i]);
        }

        return ans;
    }
}
