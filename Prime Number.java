class Solution {
    static boolean isPrime(int n) {
        // code here
        int cnt=0,i;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if((n/i)!=i){
                    cnt++;
                }
            }
            
        }
        if(cnt==2){
                return true;
        }else{
                return false;
        }
    }
}
