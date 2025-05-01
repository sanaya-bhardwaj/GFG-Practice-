class Solution {
    // Function to do transpose of mat.
    static void transpose(int mat[][]) {
        for (int i = 0; i < mat.length; i++)
            for (int j = i; j < mat[0].length; j++) {
                // swapping elements at (i,j) and (j,i).
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
    }

    // after transposing we swap elements of each column (1st with last, 2nd with
    // second last) one by one for finding left rotation of mat by 90 degree.
    static void reverseColumns(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++)
            for (int j = 0, k = mat[0].length - 1; j < k; j++, k--) {
                // swapping elements in each column.
                int temp = mat[j][i];
                mat[j][i] = mat[k][i];
                mat[k][i] = temp;
            }
    }

    // Function to rotate mat anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        transpose(mat);
        reverseColumns(mat);
    }
}
