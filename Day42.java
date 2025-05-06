class Solution {
    // Function to check if array has 2 elements
    // whose sum is equal to the given value
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int numberToFind = target - arr[i];
            // if numberToFind is found in map, return them
            if (hash.containsKey(numberToFind)) {
                return true;
            }
            // number was not found. Put it in the map.
            hash.put(arr[i], i);
        }
        return false;
    }
};
