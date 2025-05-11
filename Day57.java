class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = arr.length;
        // count number of distinct elements for first window of size k
        for (int i = 0; i < k; i++) {
            if (hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else
                hm.put(arr[i], 1);
        }
        result.add(hm.size());

        // calculate answer for rest of the windows
        for (int i = k; i < n; i++) {
            // if frequency of last element of the window is greater than 1
            // then decrease the frequency
            if (hm.get(arr[i - k]) > 1) {
                hm.put(arr[i - k], hm.get(arr[i - k]) - 1);
                // insert new element into the window
                if (hm.containsKey(arr[i]))
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                else
                    hm.put(arr[i], 1);
            } else {
                // remove last element from window
                hm.remove(arr[i - k]);
                // insert new element into the window
                if (hm.containsKey(arr[i]))
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                else
                    hm.put(arr[i], 1);
            }

            result.add(hm.size());
        }
        return result;
    }
}
