To insert an element into a sorted array while maintaining the order, we need to:

Find the correct position for the new element.
Shift the elements to the right from that position.
Insert the new element at the correct spot.

import java.util.Arrays;

public class InsertInSortedArray {
    public static void main(String[] args) {
        // Initial sorted array
        int[] arr = {10, 20, 30, 40, 50};
        int newElement = 35;  // Element to be inserted

        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Find the position where the new element should be inserted
        int position = 0;
        while (position < arr.length && arr[position] < newElement) {
            position++;
        }

        // Copy elements up to the insertion point
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = newElement;

        // Copy the remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new sorted array
        System.out.println("Array after inserting in sorted order: " + Arrays.toString(newArr));
    }
}

Explanation:
Find the correct position: Use a while loop to find where the new element should go, i.e., the first element that is greater than the new element.
Copy elements: Copy the elements before the insertion point from the original array to the new array.
Insert the element: Insert the new element at the correct position.
Shift remaining elements: Copy the rest of the elements to their new positions.

output: Array after inserting in sorted order: [10, 20, 30, 35, 40, 50]
