class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int highest = 0;
        int x = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1] + 1) {
                ++x;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                if (x > highest) {
                    highest = x;
                }
                x = 1;
            }
        }
        if (x > highest) {
                    highest = x;
        }
        return highest;
    }
}