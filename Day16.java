class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String str1, String str2) {
        int h1[] = new int[26];
        Arrays.fill(h1, 0);

        // an array of size 26, to store count of characters.
        if (str1.length() != str2.length()) {
            return false;
        }

        // storing count of each character in the first string.
        for (int i = 0; i < str1.length(); i++) {
            h1[str1.charAt(i) - 'a']++;
        }

        // decrementing the count of characters encountered in the second string.
        for (int i = 0; i < str2.length(); i++) {
            h1[str2.charAt(i) - 'a']--;
        }

        // iterating over the array to check if count at every index is 0 or not.
        for (int i = 0; i < 26; i++) {
            if (h1[i] != 0) {
                return false;
            }
        }
        // returning the result.
        return true;
    }
}
