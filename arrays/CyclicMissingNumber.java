import java.util.Arrays;

public class CyclicMissingNumber {

    public static void main(String[] args) {
        int[] input = { 1, 2, 2, 4, 6, 5 };
        int[] result = missing(input);
        System.out.println("The duplicate and missing numbers are" + Arrays.toString(result));
    }

    public static int[] missing(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int current = nums[i] - 1;
            if (nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }
        }

        ;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    private static void swap(int[] nums, int i, int current) {
        int temp = nums[current];
        nums[current] = nums[i];
        nums[i] = temp;
    }
}
