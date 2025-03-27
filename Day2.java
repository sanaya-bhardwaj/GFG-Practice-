// User function Template for Java
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int a =0;
        int b=0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=0)
            {  
                int temp = arr[a];
                arr[a] =arr[b];
                arr[b] =temp;
                a++;
                b++;
            }
            else
            {
                a++;
            }
            i++;
        }
    }
}
