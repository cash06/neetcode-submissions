class Solution {
    public int maxArea(int[] heights) {
        // 1. define helper variables
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        // 2. loop through heights with l and r
        while (l < r) {
            // 3. check for new max volume and set or skip
            if (Math.min(heights[l], heights[r]) * (r - l) > max) {
                max = Math.min(heights[l], heights[r]) * (r - l);
            } 
            // 4. go to next bar
            if (heights[l] > heights[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return max;
    }
}
