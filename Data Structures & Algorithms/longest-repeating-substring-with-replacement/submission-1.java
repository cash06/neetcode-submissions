class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLetters = 0;
        int max = 0;
        int[] charCounts = new int[26];
        for (int r = 0; r < s.length(); ++r) {
            ++charCounts[s.charAt(r) - 'A'];
            maxLetters = Math.max(maxLetters, charCounts[s.charAt(r) - 'A']);
            while (r - l - maxLetters + 1 > k) {
                --charCounts[s.charAt(l) - 'A'];
                ++l;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
