class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int l = 0;
        int r = 1;
        int max = 0;
        HashSet<Character> set = new HashSet();
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        set.add(s.charAt(l));
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                ++r;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(l));
                ++l;
            }
        }
        return max;
    }
}
