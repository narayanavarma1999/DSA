import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 1, 2 };
        int[] result = insertion(nums);
        System.out.println("The insertion sorted array is " + Arrays.toString(result));
    }

    private static int[] insertion(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return nums;

    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
