import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static void main(String[] args) {
        int[] temp = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result = getTemperatureDifferences(temp);
        System.out.println("The resultant temperatures differnece is " + Arrays.toString(result));
    }

    private static int[] getTemperatureDifferences(int[] temp) {
        Stack<Integer> stack = new Stack();
        int result[] = new int[temp.length];
        int n = temp.length;
        for (int i = n - 1; i >= 0; i--) {
            int currentTemperature = temp[i];
            while (!stack.empty() && currentTemperature > temp[stack.peek()]) {
                stack.pop();
            }
            if (!stack.empty()) {
                result[i] = stack.peek() - i;
                System.out.println("stack index " + stack.peek() + " current index " + i);
            } else {
                result[i] = 0;
            }
            stack.push(i);
        }

        return result;
    }

}
