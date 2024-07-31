class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Character> mpp= new HashMap<>();
        for(int i =0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!mpp.containsKey(original)){
                if(!mpp.containsValue(replacement)){
                    mpp.put(original,replacement);
                }
                else{
                    return false;
                }
            }
                else{
                    char mappedChar= mpp.get(original);
                    if(mappedChar!=replacement){
                        return false;
                    }
                }
        }
        return true;
    }
}