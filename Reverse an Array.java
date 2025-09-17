//using single variable
class Solution {
    public void reverseArray(int arr[]) {
        reverse(arr, 0, arr.length);
    }

    private void reverse(int[] arr, int i, int n) {
        if (i >= n / 2) return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse(arr, i + 1, n);
    }
}

//using recursion and two pointer approach
class Solution {
    public void reverseArray(int[] arr) {
        reverseHelper(arr, 0, arr.length - 1);
    }

    private void reverseHelper(int[] arr, int left, int right) {
        // Base case: stop when pointers cross
        if (left >= right) return;

        // Swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverseHelper(arr, left + 1, right - 1);
    }
}
