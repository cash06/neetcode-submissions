public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 1. Initialize helper variables
        int n = nums.length;
        int[] output = new int[n - k + 1];

        // Stores indices, not values.
        // nums[q[0]] will always be the largest value in the current window.
        Deque<Integer> q = new LinkedList<>();

        int l = 0, r = 0;

        // 2. Expand the window by moving r through nums
        while (r < n) {

            // 3. Remove indices from the back whose values are smaller
            // than nums[r], because they can never become the max while
            // nums[r] is still in the window.
            while (!q.isEmpty() && nums[q.getLast()] < nums[r]) {
                q.removeLast();
            }

            // 4. Add the current index r to the back of the deque
            q.addLast(r);

            // 5. Remove the first index if it has fallen outside
            // the left side of the current window.
            if (l > q.getFirst()) {
                q.removeFirst();
            }

            // 6. Once the window has reached size k,
            // the front of the deque is the index of the maximum value.
            if ((r + 1) >= k) {
                output[l] = nums[q.getFirst()];
                l++;
            }

            r++;
        }

        return output;
    }
}