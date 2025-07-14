import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = { 0, 0, 3, 3, 5, 6 };
        int x = removeDuplicates(nums);
        System.out.println("x value is " + Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x + 1;
    }
}
