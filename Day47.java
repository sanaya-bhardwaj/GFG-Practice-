class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[1000001];
        int count = 0;
        int maximum = -1;
        int ans = Integer.MIN_VALUE;

        // Populate the frequency array and find maximum element in arr
        for (int i = 0; i < n; i++) {
            arr2[arr[i]]++;
            maximum = Math.max(maximum, arr[i]);
        }

        // Traverse the frequency array to find the longest consecutive subsequence
        for (int i = 0; i <= maximum; i++) {
            if (arr2[i] >= 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}
