import java.util.Stack;

public class RemoveOuterPartheneseWithStack {

    public static void main(String[] args) {
        String str = "(()())(())";
        String outer = removeOuterParentheses(str);
        System.out.println("The resultant string s is " + outer);
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!stack.isEmpty()) {
                    result.append(ch); // Not outermost
                }
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.append(ch); // Not outermost
                }
            }
        }

        return result.toString();
    }
}
