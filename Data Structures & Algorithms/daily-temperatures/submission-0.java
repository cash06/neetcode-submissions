class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; ++i) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int day = stack.pop()[1];
                result[day] = i - day;
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
