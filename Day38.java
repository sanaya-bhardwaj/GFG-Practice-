class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        int i = 0, j = m - 1; // set indexes for top right element

        // loop until we reach the bottom left element of the matrix
        while (i < n && j >= 0) {
            // if the current element is equal to x, return true
            if (mat[i][j] == x) {
                return true;
            }

            // if the current element is greater than x, move to the left column
            if (mat[i][j] > x)
                j--;
            else
                // if the current element is less than x, move to the next row
                i++;
        }

        // return false if the element is not found in the matrix
        return false;
    }
}
