class Solution {
    // Function to search a given number in a strictly sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;    // Number of rows
        int m = mat[0].length; // Number of columns

        int left = 0, right = n * m - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_value = mat[mid / m][mid % m]; // Convert 1D index to 2D

            if (mid_value == x) {
                return true; // Found the target
            } else if (mid_value < x) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Element not found
    }
}
