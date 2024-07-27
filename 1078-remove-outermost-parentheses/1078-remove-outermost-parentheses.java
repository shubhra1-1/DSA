class Solution {
    public String removeOuterParentheses(String s) {

        int count =0;
        StringBuilder answer= new StringBuilder();

        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c==')') count--;
            if(count!=0) answer.append(c); // taaki outer paranthesis na le paaye 
            if(c=='(') count++;
        }
        return answer.toString();
    }
 
}