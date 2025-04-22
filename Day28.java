class Solution {
    // Function to count the number of occurrences of a given number in an array.
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int lb = -1;

        // Finding the first occurrence (lower bound) of target
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else {
                lb = mid;
                r = mid - 1;
            }
        }

        // If the element is not present in the array
        if (lb == -1 || arr[lb] != target) return 0;

        l = 0;
        r = n - 1;
        int ub = -1;

        // Finding the last occurrence (upper bound) of k
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) {
                ub = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // Return the count of occurrences
        return ub - lb + 1;
    }
}
