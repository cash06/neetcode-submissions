class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        // go through tokens
        for (String t : tokens) {
            // check if operation or number
            if (!"*/+-".contains(t)) {
                stack.push(Integer.valueOf(t));
                continue;
            }
            // call helper for operation
            int two = stack.pop();
            int one = stack.pop();
            stack.push(helper(t, one, two));
        }
        return stack.pop();
    }
    // helper to compute
    private int helper(String t, int num1, int num2) {
        if (t.equals("+")) {
            return num1 + num2;
        } else if (t.equals("-")) {
            return num1 - num2;
        } else if (t.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
}
