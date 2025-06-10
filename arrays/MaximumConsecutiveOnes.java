public class MaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] input = { 1, 1, 0, 1, 1, 1 };
        int result = findConsecutiveOnes(input);
        System.out.println("The consecutive ones count is " + result);
    }

    private static int findConsecutiveOnes(int[] input) {
        int count = 0;
        int maxCount = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

}
