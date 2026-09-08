class Solution {
    public int trap(int[] height) {
        // 1. setup helper variables
        int l = 0;
        int r = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        int water = 0;
        // 2. while loop with left and right pointers
        while (l < r) {
            // 3. check which pointer is lower
            if (height[l] <= height[r]) {
                // 4. check if pointer is higher than max
                if (lmax < height[l]) {
                    // 5. new max
                    lmax = height[l];
                } else {
                    // 6. add water to total
                    water += lmax - height[l];
                }
                ++l;
            } else {
                if (rmax < height[r]) {
                    rmax = height[r];
                } else {
                    water += rmax - height[r];
                }
                --r;
            }
        }
        return water;
    }
}
