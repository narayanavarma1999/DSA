import java.util.Arrays;

public class RotateElements {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated elements array is " + Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        if (k > 0) {
            k = k % end;
        }
        reverse(nums, start, end);
        reverse(nums, 0, k - 1);
        reverse(nums, k, end);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
