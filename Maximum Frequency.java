import java.util.Arrays;

class Solution {
    public static int maxFrequency(int[] arr, int n, int k) {
        Arrays.sort(arr);   // Step 1: Sort the array
        long total = 0;     // Sum of current window
        int left = 0;
        int maxFreq = 1;

        // Step 2: Expand window with right pointer
        for (int right = 0; right < n; right++) {
            total += arr[right];

            // Step 3: While operations needed > k, shrink from left
            while ((long) arr[right] * (right - left + 1) - total > k) {
                total -= arr[left];
                left++;
            }

            // Step 4: Update maximum frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
