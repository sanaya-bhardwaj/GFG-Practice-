


class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        int n=s1.length();
        if(n!=s2.length())
        return false;
        String concate=s1+s1;
        return kmp(concate,s2);
        
    }
    
    
    private static boolean kmp(String text,String pattern){
        int[] lps=compute(pattern);
        int i=0,j=0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length())
                return true;
            }
            else{
            if(j!=0){
                j=lps[j-1];
            }
            else{
                i++;
            }
            }
        }
        return false;
    }
    
    private static int[] compute(String pattern){
        int n=pattern.length();
        int[] lps=new int[n];
        int len=0,i=1;
        while(i<n){
            if(pattern.charAt(i)==pattern.charAt(len)){
                lps[i++]=++len;
            
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i++]=0;
                }
            }
        }
        return lps;
    }}
