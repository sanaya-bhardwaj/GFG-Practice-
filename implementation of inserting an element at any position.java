import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        // Initial array
        int[] arr = {10, 20, 30, 40, 50};
        int newElement = 25;  // Element to be inserted
        int position = 2;     // Index where the element will be inserted

        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

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

        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}

Explanation:
Create a new array newArr with a size greater by 1 than the original array.
Copy elements from the original array to the new one up to the insertion index.
Insert the new element at the specified position.
Copy the remaining elements from the original array to the new array.
Print the resulting array.

Array after insertion: [10, 20, 25, 30, 40, 50]
