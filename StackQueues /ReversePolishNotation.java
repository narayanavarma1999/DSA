import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] input = { "2", "1", "+", "3", "*" };
        int result = reversePolishNotation(input);
        System.out.println("The result polish notation output is " + result);
    }

    private static int reversePolishNotation(String[] input) {
        Stack<Integer> stack = new Stack<>();
        for (String ch : input) {
            if (ch == "+") {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a + b);
            } else if (ch == "-") {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a - b);
            } else if (ch == "*") {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a * b);
            } else if (ch == "/") {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a / b);
            } else {
                stack.add(Integer.parseInt(ch));
            }
        }

        return stack.pop();
    }
}
