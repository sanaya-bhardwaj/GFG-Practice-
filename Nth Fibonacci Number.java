class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n<=1) return n;
        int last=nthFibonacci(n-1);
        int slast=nthFibonacci(n-2);
        return last+slast;
    }
}
