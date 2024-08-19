class Solution {

    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }
        bouquets += count / k;
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
int n = bloomDay.length;
if (n < val) return -1;

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            minDay = Math.min(minDay, bloomDay[i]);
            maxDay = Math.max(maxDay, bloomDay[i]);
        }

        int low = minDay;
        int high = maxDay;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
