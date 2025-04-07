


class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int missP = 1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0) {
                continue;
            }
            else if(arr[i] == missP){
                missP++;
            }
            else if(arr[i] > missP){
                break;
            }
        }
        return missP;
    }
}
