class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            list.putIfAbsent(sorted, new ArrayList<>());
            list.get(sorted).add(s);
        }
        return new ArrayList<>(list.values());
    }
}
