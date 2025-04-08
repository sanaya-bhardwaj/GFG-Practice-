

class Solution {
    public int myAtoi(String s) {
        // Your code here
        int idx = 0, sign = 1;
        long res = 0;
        while(idx<s.length() && s.charAt(idx)== ' '){
             idx++;
        }
        if(idx<s.length() && (s.charAt(idx)== '-' || s.charAt(idx)=='+')){
            sign = (s.charAt(idx)== '-')? -1:1;
            idx++;
        }
        
        while(idx<s.length() && Character.isDigit(s.charAt(idx))){
            res = res*10+(s.charAt(idx)-'0');
            if(res*sign>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(res*sign<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            idx++;
        }
        
        return (int)(res*sign);
    }
}
