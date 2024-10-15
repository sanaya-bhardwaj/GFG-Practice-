// Java Program to reverse an array using temporary array

import java.util.Arrays;

class GfG {
    
    // function to reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Temporary array to store elements in reversed order
        int[] temp = new int[n];
  
        // Copy elements from original array to temp in reverse order
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
  
        // Copy elements back to original array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}

// Java Program to reverse an array by swapping elements

import java.util.Arrays;

class GfG {
    
    // function to reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Iterate over the first half and for every index i,
        // swap arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}
