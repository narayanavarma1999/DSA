import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = { 5, 2, 4, 1 };
        int[] result = bubbleSort(input);
        System.out.println("The resultant array is " + Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {

            boolean isSwapped = false;

            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
        return input;
    }
}
