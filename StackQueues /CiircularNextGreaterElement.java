import java.util.Arrays;
import java.util.Stack;

public class CiircularNextGreaterElement {

    public static void main(String[] args) {
        // int[] input = { 1, 2, 1 };
        int[] input = { 1, 5, 0, 3, 4, 9, 2, 6, 8 };
        int[] result = findNextGreatestElement(input);
        System.out.println("The resultant output is " + Arrays.toString(result));
    }

    private static int[] findNextGreatestElement(int[] input) {
        int n = input.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = (2 * n) - 1; i >= 0; i--) {
            int current = input[i % n];
            while (!stack.empty() && current > input[stack.peek()]) {
                stack.pop();
            }
            if (!stack.empty()) {
                result[i % n] = input[stack.peek()];
            }
            stack.push(i % n);
        }
        return result;
    }

}
