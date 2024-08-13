class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        long hour=0;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            hour=0;
            int mid=low+(high-low)/2;
            int dif;
            for (int pile : piles) {
                hour += (pile+mid-1)/mid;
            }
            if(hour>h) low=mid+1;
            else {
                high=mid-1;
                if(mid<min) min=mid;
            }
        }
        return min;
    }
}