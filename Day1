class Solution {
    public int getSecondLargest(int[] arr) {
        int firstLargest=0;
        int secondLargest=0;
        for(int i:arr){
            if(i>firstLargest){
                secondLargest=firstLargest;
                firstLargest=i;
            }
            else if(i>secondLargest&&i<firstLargest){
                secondLargest=i;
            }
        }
        if(secondLargest==0){
            return -1;
        }
        return secondLargest;
    }
}
