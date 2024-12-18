//Print numbers from 1 to n without the help of loops. 
//You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.
//Note: Don't print any newline, it will be added by the driver code.

// User function Template for Java

class Solution {
    public static void printNos(int n) {
        // Base condition: If n reaches 0, end recursion
        if (n == 0) {
            return;
        }
        // Recursive call to handle smaller problem (printing 1 to n-1)
        printNos(n - 1);
        // Print the current number followed by a space
        System.out.print(n + " ");
    }
}
