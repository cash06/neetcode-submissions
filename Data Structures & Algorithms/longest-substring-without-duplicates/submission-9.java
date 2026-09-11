class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 1. edge case
        if (s.length() == 1) return 1;
        if (s.length() == 0) return 0;
        // 2. helper variables
        int l = 0;
        int r = 1;
        int max = 0;
        HashSet<Character> set = new HashSet();
        set.add(s.charAt(l));
        // 3. go through string
        while (r < s.length()) {
            // 4. put in hashset
            if (set.add(s.charAt(r))) {
                // 5. add r, increment r, and check for new max
                ++r;
                max = Math.max(set.size(), max);
            } else {
                // 6. get rid of l
                set.remove(s.charAt(l));
                ++l;
            }
        }
        return max;
    }
}
