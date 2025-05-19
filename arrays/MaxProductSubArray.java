
public class MaxProductSubArray {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If number is negative, swap currentMax and currentMin
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update current max and min
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update global max product
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    // Function to find maximum product subarray
    // public int maxProduct(int[] nums) {
    // // Initialize result with first element of nums
    // int result = nums[0];

    // /*
    // * Iterate through each element
    // * as a starting point of subarray
    // */
    // for (int i = 0; i < nums.length; i++) {
    // // Initialize p with nums[i]
    // int p = nums[i];

    // /*
    // * Iterate through subsequent elements
    // * to form subarrays starting from nums[i]
    // */
    // for (int j = i + 1; j < nums.length; j++) {

    // /*
    // * Update result with the
    // * max of current result and p
    // */
    // result = Math.max(result, p);

    // // Update p by multiplying with nums[j]
    // p *= nums[j];
    // }

    // // Update result for subarray ending at nums[i]
    // result = Math.max(result, p);
    // }

    // // Return maximum product subarray found
    // return result;
    // }

    public static void main(String[] args) {
        MaxProductSubArray sol = new MaxProductSubArray();
        int[] nums = { 2, 3, -2, 4 };
        sol.maxProduct(nums);
        System.out.println("Maximum product subarray: " + sol.maxProduct(nums)); // Output: 6
    }
}
