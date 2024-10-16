import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initial array
        int[] arr = {10, 20, 30, 40};

        // Element to insert
        int newElement = 50;

        // Create a new array with one more size than the original array
        int[] newArr = new int[arr.length + 1];

        // Copy elements of the original array to the new array
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Add the new element at the end
        newArr[arr.length] = newElement;

        // Output the new array
        System.out.println("New array: " + Arrays.toString(newArr));
    }
}
