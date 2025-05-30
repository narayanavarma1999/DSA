public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum Subarray Sum is: " + maxSubArray(nums));

    }

    private static int maxSubArray(int[] nums) {
        int currentMaxSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSum = Math.max(currentMaxSum, maxSum);
        }
        return maxSum;
    }

}
