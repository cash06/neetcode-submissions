class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Create Hashmap and fill
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Create Buckets and fill
        List<Integer>[] buckets = new List[nums.length + 1];
        count.forEach((num, freq) -> {
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });

        // 3. Create result
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; --i) {
            if(buckets[i] != null) result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
