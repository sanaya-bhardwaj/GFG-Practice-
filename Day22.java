

class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        
        int hIndex = 0;
        
        for (int i = 0; i < n; i++) {
            int j = n - i;
            if (citations[i] >= j) {
                hIndex = j;
                break;
            }
        }
        
        return hIndex;
    }
}
