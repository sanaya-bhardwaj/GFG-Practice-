class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int k = 0; k <= i; k++) {
            result.add(arr[k]);
        }

        return result;
    }
}
