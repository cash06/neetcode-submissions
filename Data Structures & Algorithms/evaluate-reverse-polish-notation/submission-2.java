class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String t : tokens) {
            if (!"*/+-".contains(t)) {
                stack.push(Integer.valueOf(t));
                continue;
            }
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(helper(t, num1, num2));
        }
        return stack.pop();
    }
    private int helper(String t, int num1, int num2) {
        if (t.equals("+")) {
            return num1 + num2;
        } else if (t.equals("-")) {
            return num1 - num2;
        } else if (t.equals("*")) {
            return num1 * num2;
        } else if (t.equals("/")) {
            return num1 / num2;
        }
        return 0;
    }
}
