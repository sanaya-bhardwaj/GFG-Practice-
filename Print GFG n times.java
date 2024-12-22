//Print GFG n times without the loop.
//Example:
//Input:
//5
//Output:
//GFG GFG GFG GFG GFG
//Your Task:
//This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively. 
//Don't print newline, it will be added by the driver code.


class Solution {
    public void printGfg(int n) {
        if (n <= 0) {
            return; // Base case: Stop recursion when n is 0
        }
        System.out.print("GFG "); // Print "GFG" without a newline
        printGfg(n - 1); // Recursive call
    }
}
