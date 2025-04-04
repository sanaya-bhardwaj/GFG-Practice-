

class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
         if(arr.length ==0){
        return 0;
    }
        int ms = arr[0];
        int cs =arr[0];
        for(int i=1;i<arr.length;i++){
            cs = Math.max(arr[i], cs + arr[i]);
        
            ms= Math.max(cs,ms);
        }
        return ms;
        
    }
}
