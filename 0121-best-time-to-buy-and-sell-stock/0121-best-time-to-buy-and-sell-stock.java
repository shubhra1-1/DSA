class Solution {
    public int maxProfit(int[] a) {
        int n= a.length;
        int profit = 0;
        int min = a[0];

        for(int i =1;i<n;i++){
            int cost = a[i]-min;
            profit= Math.max(cost,profit);
            min= Math.min(a[i],min);

        }
        return profit;
    }
}