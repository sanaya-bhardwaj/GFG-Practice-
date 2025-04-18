class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // If there are no arr, return an empty list
        if (arr.length == 0) {
            return new ArrayList<>();
        }

        // Sort arr based on the start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // List to hold the merged arr
        List<int[]> mergedarr = new ArrayList<>();

        // Start with the first interval
        int[] currentInterval = arr[0];
        mergedarr.add(currentInterval);

        for (int[] interval : arr) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // There is overlap, so merge the arr
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the new interval to the list
                currentInterval = interval;
                mergedarr.add(currentInterval);
            }
        }

        return mergedarr;
    }
}
