class Solution {
    int calculate(char a){
        if(a=='I'){
            return 1;
        }
        if(a=='V'){
            return 5;
        }
        if(a=='X'){
            return 10;
        }
        if(a=='L'){
            return 50;
        }
        if(a=='C'){
            return 100;
        }
        if(a=='D'){
            return 500;
        }
        if(a=='M'){
            return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        char [] n = s.toCharArray();
        int len= n.length;
        int ans=0;
        int v1;
        int v2;
        for(int i=0;i<len;i++){
            if(i<len-1){
            v1=calculate(n[i]);
            v2=calculate(n[i+1]);

            if(v1>=v2){
                ans=ans+v1;
            }
            else{
                ans=ans-v1;
            }
            }
            else{
                ans=ans+calculate(n[i]);

            }
           

        }

        return ans;
    }
}