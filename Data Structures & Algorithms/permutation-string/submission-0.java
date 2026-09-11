class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        Arrays.sort(one);
        for (int i = 0; i <= two.length - one.length; ++i) {
            char[] temp = Arrays.copyOfRange(two, i, i + one.length);
            Arrays.sort(temp);
            if (Arrays.equals(one, temp)) {
                return true;
            }
        }
        return false;
    }
}
