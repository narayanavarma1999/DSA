public class ArraySum {

    public static void main(String[] args) {
        int[] nums = { 5, 3, 2, 0, 1 };
        int n = nums.length - 1;
        int result = sum(nums, n);
        System.out.println("The resulted sum is " + result);
    }

    private static int sum(int[] nums, int n) {
        System.out.println(nums[n]);
        if (n == 0) {
            return nums[n];
        }

        boolean isOdd = nums[n] % 2 != 0;

        System.out.println("value of n " + n);
        if (isOdd) {
            return nums[n] + sum(nums, n - 1);
        } else {
            return 0 + sum(nums, n - 1);
        }
    }
}

