class Solution {
    public boolean isPalindrome(String s) {
        // 1. initialize helper vars
        int left = 0;
        int right = s.length() - 1;
        // 2. loop to go through string
        while (left < right) {
            // 3. loop to skip non alphanumeric characters left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            // 4. loop to skip non alphanumeric characters right
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            // 5. check palindrome condition
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
