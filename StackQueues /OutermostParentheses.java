public class OutermostParentheses {

    public static void main(String[] args) {
        String input = "(()())(())";
        String output = removeOuterParentheses(input);
        System.out.println("The output parentheses value is " + output);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0)
                    result.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0)
                    result.append(ch);
            }
        }

        return result.toString();
    }

}