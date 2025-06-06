
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String[] input = { "n", "a", "r", "a", "y", "a", "n", "a" };
        String[] result = reverseString(input);
        System.out.println(Arrays.toString(result));
    }

    public static String[] reverseString(String[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            String temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }
}
    