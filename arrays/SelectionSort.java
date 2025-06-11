import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 4, 3, 2 };
        int[] result = selectionSort(input);
        System.out.println("The resultant sorted array is " + Arrays.toString(result));
    }

    private static int[] selectionSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            int lastIndex = input.length - 1 - i;
            int maxIndex = getMaxIndex(input, 0, lastIndex);
            swap(lastIndex, maxIndex, input);
        }

        return input;
    }

    private static int getMaxIndex(int[] input, int start, int last) {
        int max = start;
        for (int j = start; j <= last; j++) {
            if (input[j] > input[max]) {
                max = j;
            }
        }
        return max;
    }

    private static void swap(int first, int second, int[] input) {
        int temp = input[second];
        input[second] = input[first];
        input[first] = temp;
    }

}
