import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };
        int[] result = moveZeros(nums);
        System.out.println("The resultant array is " + Arrays.toString(result));
    }

    private static int[] moveZeros(int[] nums) {
        int p1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p1] = nums[i];
                p1++;
            }
        }

        for (int i = p1; i < nums.length; i++) {
            nums[i]=0;
        }
        return nums;
    }

}