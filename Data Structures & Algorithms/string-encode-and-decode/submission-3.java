class Solution {

    public String encode(List<String> strs) {
        // 1. Setup Stream Builder
        StringBuilder bob = new StringBuilder();
        // 2. Create one string with length and ASCII char
        for (String s : strs) {
            bob.append(s.length()).append('#').append(s);
        }
        return bob.toString();
    }

    public List<String> decode(String str) {
        // 3. Create ArrayList and index variable
        List<String> result = new ArrayList<>();
        int i = 0;
        // 4. Loop to go through str using i
        while (i < str.length()) {
            int j = i;
            // 5. Get str length with another loop
            while (str.charAt(j) != '#') {
                ++j;
            }
            int length = Integer.parseInt(str.substring(i, j));
            // 6. Get the string with i and length and add to result
            i = j + 1;
            result.add(str.substring(i, i + length));
            // 7. increment i to set up next string to be added
            i += length;
        }
        return result;
    }
}
