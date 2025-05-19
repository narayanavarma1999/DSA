import java.util.Arrays;

public class ProductSelfArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExpectSelf(nums);
        System.out.println("Output of resultant array is" + Arrays.toString(result));
    }

    private static int[] productExpectSelf(int[] nums) {
        int[] result = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        System.out.println("result is " + Arrays.toString(result));

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = rightProduct * result[i];
            rightProduct = rightProduct * nums[i];
        }
        return result;

    }
}