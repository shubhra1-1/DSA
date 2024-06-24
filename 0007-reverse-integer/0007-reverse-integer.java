class Solution {
    public int reverse(int x) {
        int revNum = 0;
        
        while (x != 0) {
            int ld = x % 10;
            // Check for overflow/underflow before updating revNum
            if (revNum > Integer.MAX_VALUE/10 || (revNum == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (revNum < Integer.MIN_VALUE/10 || (revNum == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0; // Underflow case for negative numbers
            }
            revNum = (revNum * 10) + ld;
            x = x / 10;
        }
        
        return revNum;
    }
}

