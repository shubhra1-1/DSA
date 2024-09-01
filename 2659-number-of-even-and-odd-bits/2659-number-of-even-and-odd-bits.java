class Solution {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        for(int i=0;i<32;i++){
        if ((n & (1 << i)) != 0) {
            if(i%2==0) res[0]+=1;
            else res[1]+=1;
            }
        }
        return res;
    }
}