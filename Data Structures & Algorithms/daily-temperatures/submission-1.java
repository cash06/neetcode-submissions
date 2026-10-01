class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // initialize array for result
        int[] result = new int[temperatures.length];
        // fill with base zero
        Arrays.fill(result, 0);
        Stack<int[]> stack = new Stack<>();
        // go through temperatures values
        for (int i = 0; i < temperatures.length; ++i) {
            // remove if less
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int day = stack.pop()[1];
                result[day] = i - day;
            }
            // add value to stack
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
