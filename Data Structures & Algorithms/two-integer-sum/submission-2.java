class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Go through nums
        for (int i = 0; i < nums.length; ++i) { // first pointer
            for (int j = i + 1; j < nums.length; ++j) { // second pointer
                if (nums[i] + nums[j] == target) { // check for target
                    int[] x = {i, j};
                    return x;
                }
            }
        }
        return null;
    }
}
