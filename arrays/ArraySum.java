public class ArraySum {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 2, 0, 1 };
        int n = nums.length-1;
        int result = sum(nums, n);
        System.out.println("The resulted sum is " + result);
    }

    private static int sum(int[] nums, int n) {
        System.out.println("value of n " + n);
        if (n == 0) {
            return nums[n];
        }
        System.out.println(nums[n]);
        return nums[n] + sum(nums, n - 1);
    }
}

// 1 + 2 + 3 + 5