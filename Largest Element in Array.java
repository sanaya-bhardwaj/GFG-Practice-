class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest=arr[0];
        int i,n=arr.length;
        for (i=0;i<n;i++){
            if(arr[i]>largest) largest=arr[i];
        }
        return largest;
    }
}
