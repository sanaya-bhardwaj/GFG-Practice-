class Solution {
    // Function to search a given number in a row-wise sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length; // Number of rows

        for (int i = 0; i < n; i++) {
            int left = 0, right = mat[i].length - 1;

            // Perform binary search in the current row
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (mat[i][mid] == x) {
                    return true; // Found the target
                } else if (mat[i][mid] < x) {
                    left = mid + 1; // Search in the right half of the row
                } else {
                    right = mid - 1; // Search in the left half of the row
                }
            }
        }
        return false; // Element not found in any row
    }
}
