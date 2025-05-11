class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
