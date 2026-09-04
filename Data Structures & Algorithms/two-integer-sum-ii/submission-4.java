class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 1. initialize pointer variables and result array
        int l = 0;
        int r = numbers.length - 1;
        int[] result = new int[2];
        // 2. loop through numbers
        while (l < r) {
            // 3. if statements to find correct two ints
            if (numbers[l] + numbers[r] > target) {
                --r;
            } else if (numbers[l] + numbers[r] < target) {
                ++l;
            } else { // 4. correct ints found
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            }
        }
        return result;
    }
}
