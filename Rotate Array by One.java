class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];   // store last element

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // shift right
        }

        arr[0] = temp;           // put last element at front
    }
}
