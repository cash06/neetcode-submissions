class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>(); // create hashmap
        for (int num : nums) { // populate hashmap
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1]; // make bucket list
        count.forEach((num, freq) -> { // lambda function to fill buckets
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>(); // check for null bucket
            buckets[freq].add(num); // add num to bucket
        });

        List<Integer> result = new ArrayList<>(); // create list to return
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; --i) { // go through buckets backwards
            if (buckets[i] != null) result.addAll(buckets[i]); // add all numbers in k buckets
        }

        return result.stream().mapToInt(i -> i).toArray(); // change from list to array and return
    }
}
