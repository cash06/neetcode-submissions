class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. check for zero array
        if (nums.length == 0) {
            return 0;
        }
        // 2. Sort nums
        Arrays.sort(nums);
        // 3. initialize helper vars
        int x = 1;
        int highest = 1;
        // 4. iterate through nums
        for (int i = 1; i < nums.length; ++i) {
            // 5. check for consecutive
            if (nums[i] == nums[i - 1] + 1) {
                ++x;
            } else if (nums[i] == nums[i - 1]) { // 6. check for same
                continue;
            } else { // 7. check if new highest consecutive
                if (x > highest) {
                    highest = x;
                }
                x = 1;
            }
        }
        if (x > highest) { // 8. check if entire array is consecutive
            highest = x;
        }
        return highest;
    }
}
