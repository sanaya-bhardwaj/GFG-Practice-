class Solution {

    public int maxWater(int arr[]) {
        int l = 0;              // left wall of container
        int r = arr.length - 1; // right wall of container
        int area = 0;

        while (l < r) {
            // Calculating the max area
            area = Math.max(area, (int)Math.min(arr[l], arr[r]) * (r - l));

            // maximise height of container
            if (arr[l] < arr[r])
                l += 1;
            else
                r -= 1;
        }
        return area;
    }
}
