import java.util.*;

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies using HashMap
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Build result for numbers 1..n
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(map.getOrDefault(i, 0));
        }

        return result;
    }
}
