class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int result = 0;
        while(true){
            while(num > 0){
            result += num % 10;
            num = num / 10;
            } 
            
            if(result < 10){
                break;
            }
            num = result;
            result = 0;  
        }
        return result;
    }
}