class Solution {
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    private boolean helper(String s, int left, int right) {
        // Base case
        if (left >= right) return true;

        // If mismatch found
        if (s.charAt(left) != s.charAt(right)) return false;

        // Recurse inward
        return helper(s, left + 1, right - 1);
    }
}
