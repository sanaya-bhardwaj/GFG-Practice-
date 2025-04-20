// Java program to minimum number of intervals required 
// to be removed to make remaining intervals non-overlapping
// Using sorting by ending value

import java.util.*;

class GfG {
  
    static int minRemoval(int[][] intervals) {
        int cnt = 0;

        // Sort by minimum ending point
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // if there is an overlap increase the count
            if (intervals[i][0] < end)
                cnt++;

            // else increment the ending point
            else
                end = intervals[i][1];
        }

        // return the count
        return cnt;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 5}, {1, 4}};
        System.out.println(minRemoval(intervals));
    }
}
