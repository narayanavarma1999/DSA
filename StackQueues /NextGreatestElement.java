import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {

    public static void main(String[] args) {
        int[] input = { 1, 5, 0, 3, 4, 9, 2, 6, 28 };
        int[] result = findNextGreatestElementWithStack(input);
        System.out.println(Arrays.toString(result));
    }

    /*
     * private static int[] findNextGreatestElement(int[] input) {
     * int n = input.length;
     * int[] result = new int[n];
     * int x = 0;
     * 
     * for (int i = 0; i < n; i++) {
     * int next = -1;
     * for (int j = i + 1; j < n; j++) {
     * if (input[j] > input[i]) {
     * next = input[j];
     * break;
     * }
     * }
     * 
     * result[x++] = next;
     * }
     * return result;
     * }
     */

    private static int[] findNextGreatestElementWithStack(int[] input) {
        int n = input.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        System.out.println(Arrays.toString(res));
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                System.out.println(input[stack.peek()] + " , " + stack.peek());
            }
            while (!stack.isEmpty() && input[stack.peek()] <= input[i]) {
                stack.pop();
            }
            // Now the top (if any) is the next greater element
            if (!stack.isEmpty()) {
                res[i] = input[stack.peek()];
            }
            stack.push(i);
        }
        return res;
    }
}