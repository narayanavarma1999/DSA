public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k > n

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(java.util.Arrays.toString(arr));
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
