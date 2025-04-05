

class Solution {
    int maxProduct(int[] arr) {
        int maximum = arr[0], max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            int a = arr[i] * max;
            int b = arr[i] * min;
            max = Math.max(Math.max(a, b), arr[i]);
            min = Math.min(Math.min(a, b), arr[i]);
            maximum = Math.max(maximum, max);
        }
        return maximum;
    }
}
