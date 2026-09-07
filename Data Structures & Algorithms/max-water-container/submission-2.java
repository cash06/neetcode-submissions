class Solution {
    public int maxArea(int[] heights) {
        // 1. define helper variables
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        // 2. loop through heights with l and r
        while (l < r) {
            if (Math.min(heights[l], heights[r]) * (r - l) > max) {
                max = Math.min(heights[l], heights[r]) * (r - l);
            } 
            if (heights[l] > heights[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return max;
    }
}
