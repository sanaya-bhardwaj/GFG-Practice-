//Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
//A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
//Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

class Solution {
    static int evenlyDivides(int n) {
        int r=n;
        int count=0;
        int i=0;
        while(r>0){
            int d=r%10;
           if(d>0 && n%d==0){
               count+=1;
           } 
            r=r/10;
        }return count;
    }
}
//Given a natural number n. You have to find the number of digits in it and return it.
class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return(count);
    }
}
