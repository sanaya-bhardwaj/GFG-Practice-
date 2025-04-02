

// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        
        int max=0;
        int min=Integer.MAX_VALUE;
        int res=0;
  /*  for(int i=0;i<prices.length;i++)
       {
           for(int j=i+1;j<prices.length;j++)
           {
              
                res=-1*(prices[i]-prices[j]);
               if(res>max) max=res;
           }
       }
       if(max<0) return 0;
       return max;
     */
        
        for(int price:prices)
        {
            min=Math.min(price,min);
            res=price-min;
            max=Math.max(res,max);
        }
        return max;
    
    }
}
