class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0; // this will move
        int max=0;
        HashSet <Character> hash_set = new HashSet();
        while(b < s.length()){
            if(!hash_set.contains(s.charAt(b))){
                hash_set.add(s.charAt(b));
                b++;
                max= Math.max(hash_set.size(),max);
            }
            else{
                hash_set.remove(s.charAt(a));
                a++;
            }

        }

        return max;
    }
}