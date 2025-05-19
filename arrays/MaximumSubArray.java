import java.util.*;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = subArray(nums);
        int sum = Arrays.stream(result).sum();
        System.out.println("Max sum is :" + sum);
        System.out.println("Maximum subarray is " + Arrays.toString(result));
    }

    private static int[] subArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        int tempStart = 0;
        int end = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum = currentSum + nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
                start = tempStart;
            }
        }
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}

/*
 * 
 * public static int[] maxSubArray(int[] nums) {
 * int maxSoFar = nums[0];
 * int currentMax = nums[0];
 * int start = 0, end = 0, tempStart = 0;
 * 
 * for (int i = 1; i < nums.length; i++) {
 * if (nums[i] > currentMax + nums[i]) {
 * currentMax = nums[i];
 * tempStart = i;
 * } else {
 * currentMax += nums[i];
 * }
 * 
 * if (currentMax > maxSoFar) {
 * maxSoFar = currentMax;
 * start = tempStart;
 * end = i;
 * }
 * }
 * 
 * return Arrays.copyOfRange(nums, start, end + 1);
 * }
 * 
 * public static void main(String[] args) {
 * int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
 * int[] subarray = maxSubArray(nums);
 * 
 * int sum = Arrays.stream(subarray).sum();
 * System.out.println("Maximum Subarray Sum is: " + sum);
 * System.out.println("Maximum Subarray is: " + Arrays.toString(subarray));
 * }
 */