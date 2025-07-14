

public class MaxKSubArraySum {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 9, 3, 2, 6 };
        int k = 3;
        int max = maxSubarraySum(nums, k);
        System.out.println("The maximum sum of subarray of size " + k + " is " + max);
    }

    private static int maxSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    /*
     * private static int maxSubarraySum(int[] nums, int k) {
     * int maxSum = 0;
     * for (int i = 0; i <= nums.length - k; i++) {
     * int windowSum = 0;
     * for (int j = i; j < i + k; j++) {
     * windowSum = windowSum + nums[j];
     * }
     * maxSum = Math.max(maxSum, windowSum);
     * }
     * return maxSum;
     * }
     */
}
