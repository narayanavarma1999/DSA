
public class MissingNumber {

    public static void main(String[] args) {
        int[] input = { 1, 2, 4, 0 };
        int result = missingNumber(input);
        System.out.println("The missing number is " + result);
    }

    private static int missingNumber(int[] input) {
        /*
         * Arrays.sort(input);
         * for (int i = 0; i < input.length; i++) {
         * if (input[i] != i) {
         * return i;
         * }
         * }
         * return -1;
         */

        int n = input.length;

        int expectedSum = ((n * (n + 1)) / 2);

        int actualSum = 0;

        for (int i = 0; i < input.length; i++) {
            actualSum += input[i];
        }

        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }
}