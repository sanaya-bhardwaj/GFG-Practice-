class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1, mid = 0;

        // Using the Dutch National Flag algorithm
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid++, low++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }

    private void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
