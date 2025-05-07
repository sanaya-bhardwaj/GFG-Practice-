class Solution {

    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // Check if the complement (target - arr[i]) exists in the map
            // If yes, increment count
            if (map.containsKey(target - arr[i])) {
                count += map.get(target - arr[i]);
            }

            // Increment the frequency of arr[i]
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}
