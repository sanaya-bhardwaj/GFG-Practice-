

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        
        int n = prices.length;
        
        int ans = 0;
        
        int start = prices[0];
        for(int i=0;i<n-1;i++){
            
            if(prices[i] > prices[i+1]){
                ans += prices[i]-start;
                start = prices[i+1];
            }
        }
        ans += prices[n-1]-start;
        
        return ans;
    }
}
