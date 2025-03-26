class Solution {
    public boolean isAnagram(String s, String t) {
        String s1= s.replaceAll("\\s","");
        String t1=t.replaceAll("\\s","");
        
        if(s1.length()!=t1.length()){
            return false;
        }
        else{
            char cs[] = s1.toLowerCase().toCharArray();
            char ct[] = t1.toLowerCase().toCharArray();
            
            Arrays.sort(cs);
            Arrays.sort(ct);
            if(Arrays.equals(cs,ct)){

                    return true;
            }
            else{
                return false;
            }
            

            
    }
    
}
}