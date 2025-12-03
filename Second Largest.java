class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            // If we find a new largest
            if (num > largest) {
                slargest = largest;
                largest = num;
            }
            // If num is between slargest and largest (strictly smaller than largest)
            else if (num < largest && num > slargest) {
                slargest = num;
            }
        }

        return slargest;
    }
}
