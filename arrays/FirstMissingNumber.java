import java.util.Arrays;

public class FirstMissingNumber {

    public static void main(String[] args) {
        int[] input = { 0,1,2 };
        int result = firstMissingNumber(input);
        System.out.println("The first missing number is " + result);
    }

    private static int firstMissingNumber(int[] nums) {

        int i = 0;
        int n = nums.length;
        while (i < n) {
            int currentIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }
        System.out.println("after swapping elements" + Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return -1;

    }

    private static void swap(int[] nums, int i, int currentIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[i];
        nums[i] = temp;
    }

}