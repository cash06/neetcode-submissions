class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];

        for (int i = 0; i < t.length(); ++i) {
            need[t.charAt(i)]++;
        }

        int l = 0;
        int have = 0;
        int needed = t.length();

        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for (int r = 0; r < s.length(); ++r) {

            char c = s.charAt(r);
            window[c]++;

            // This occurrence actually helped satisfy t
            if (window[c] <= need[c]) {
                have++;
            }

            // Window contains all characters needed
            while (have == needed) {

                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    minStart = l;
                }

                char leftChar = s.charAt(l);
                window[leftChar]--;

                // Removing this character made the window invalid
                if (window[leftChar] < need[leftChar]) {
                    have--;
                }

                l++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLength);
    }
}