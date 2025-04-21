class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1;
        int j = 0;

        // Swap elements to ensure that all elements in 'a' are smaller than those in
        // 'b'
        while (i >= 0 && j < b.length && a[i] > b[j]) {
            // Swap a[i] and b[j]
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            // Move the pointers
            i--;
            j++;
        }

        // Sort both arrays to maintain the sorted order
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
