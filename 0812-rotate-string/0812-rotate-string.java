class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String temp = s + s;
        if(temp.contains(goal)){
            return true;
        }
        return false;
        
    }
}