class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0,rev=0,dup=n,lastdigit;
        while(n!=0){
           lastdigit=n%10;
        n=n/10;
        sum=sum+(lastdigit *lastdigit*lastdigit);
        rev=(rev*10)+lastdigit; 
        }
        if(sum==dup){
            return true;
        }
        else{
            return false;
        }
    }
   
}
