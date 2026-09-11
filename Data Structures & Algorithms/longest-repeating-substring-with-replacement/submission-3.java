class Solution {
    public int characterReplacement(String s, int k) {
        // 1. initialize helper variables
        int l = 0;
        int max = 0;
        int num = 0;
        int[] letters = new int[26];
        // 2. iterate through s, sliding window
        for (int r = 0; r < s.length(); r++) {
            // 3. add char to letters array
            ++letters[s.charAt(r) - 'A'];
            // 4. keep track of number of letters, for comparison with k
            num = Math.max(num, letters[s.charAt(r) - 'A']);
            // 5. loop to get rid of left side of window
            while (r - l - num + 1 > k) {
                --letters[s.charAt(l) - 'A'];
                ++l;
            }
            // 6. check for new max
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
