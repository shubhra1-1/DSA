class Solution {
    public String breakPalindrome(String palindrome) {
        char [] strArr= palindrome.toCharArray();
        if(strArr.length < 2){
            return "";
        }
        for(int i=0;i<strArr.length/2;i++){
            if(strArr[i]!='a'){
                strArr[i]='a';
                return String.valueOf(strArr);
            }   
        }
        
        strArr[strArr.length-1]='b';
        return String.valueOf(strArr);
    }
}