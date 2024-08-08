class Solution {
    public int myAtoi(String s) {
        char ch []= s.toCharArray();
        if(ch.length == 0){
            return 0;
        }
        // Skip leading whitespaces
        int i =0;
        while(i<ch.length && ch[i]==' ') i++;
        s=s.trim();
        // Edge case: if the string only contains whitespaces
        if(i >= ch.length) {
            return 0;
        }

        long ans=0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // Determine the sign
        int sign =+1;
        if(ch[i] == '-') {
            sign = -1;
            i++;
        } else if(ch[i] == '+') {
            i++;
        }
         while(i < ch.length && Character.isDigit(ch[i])) {
            ans = ans * 10 + (ch[i] - '0');
            if(sign ==-1 && -ans<min) return min;
            if(sign ==1 && ans>max) return max;

            i++;

        }   
        return (int)(sign *ans);     
    }
}