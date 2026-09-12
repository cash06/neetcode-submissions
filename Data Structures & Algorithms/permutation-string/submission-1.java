class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // 1. initialize helper variables
        char[] one = s1.toCharArray();
        Arrays.sort(one);
        char[] two = s2.toCharArray();
        // 2. go through two
        for (int i = 0; i <= two.length - one.length; ++i) {
            // 3. create sorted temp array for comparison
            char[] temp = Arrays.copyOfRange(two, i, i + one.length);
            // 4. sort temp
            Arrays.sort(temp);
            // 5. do comparison
            if (Arrays.equals(one, temp)) {
                return true;
            }
        }
        return false;
    }
}
