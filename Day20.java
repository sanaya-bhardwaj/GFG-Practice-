
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        String str = s1 + s1;
        return search(str, s2);
    }
    
    private static boolean search(String text, String pattern){
        int []lps = computeLPS(pattern);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                return true; // Match found
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false; // No match found
    }
    
    private static int []computeLPS(String pattern){
        int m = pattern.length();
        int []lps = new int[m]; // longest prefix suffix
        int len = 0;
        lps[0] = 0; // first element has no similar prefix or suffix
        int i = 1;
        
        while(i<m){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++; // increase length of matching prefix suffix
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1]; // use previous LPS to check for shorter prefix
                }else{
                    lps[i] = 0; // no match so LPS value to 0
                    i++; // move to next character
                }
            }
        }
        return lps;
    }
}
