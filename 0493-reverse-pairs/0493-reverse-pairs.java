import java.util.ArrayList;

class Solution {

    static int countPairs(int nums[], int low, int mid, int high) {
    int right = mid + 1;
    int cnt = 0;

    for (int i = low; i <= mid; i++) {
        // Move right pointer to find valid elements
        while (right <= high && nums[i] > (long)nums[right] * 2) right++;
        // Count the number of valid elements in the right part
        cnt += (right - (mid + 1));
    }

    return cnt;
}
    static int mergeSortAndCount(int nums[], int low, int high) {
        if (low >= high) return 0;
        
        int mid = (high + low) / 2;
        int cnt = 0;

        cnt += mergeSortAndCount(nums, low, mid);
        cnt += mergeSortAndCount(nums, mid + 1, high);
        cnt += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);

        return cnt;
    }

    static void merge(int nums[], int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;

        while (left <= m && right <= r) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left <= m) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= r) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            nums[i] = temp.get(i - l);
        }
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSortAndCount(nums, 0, n - 1);
    }
}
