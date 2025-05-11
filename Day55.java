//Back-end complete function Template for Java
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int n = arr.length; // Getting the length of the array

        // Sorting the input array.
        Arrays.sort(arr);
        int count = 0;

        // Traversing the array.
        for (int i = 0; i < n - 2; i++) {
            // Storing the third index starting from ith index in k.
            int k = i + 2;

            // Traversing all the elements after ith index.
            for (int j = i + 1; j < n; j++) {
                // Traversing all the elements after jth index to check if there
                // exists any element which can satisfy the condition of triangle
                // with the elements at ith, jth, and kth index.
                while (k < n && arr[i] + arr[j] > arr[k]) ++k;

                // Incrementing the count of triangles.
                if (k > j) count += k - j - 1;
            }
        }
        // Returning the count of triangles.
        return count;
    }
}
