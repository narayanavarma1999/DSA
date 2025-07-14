

public class MinimumElement {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, };
        int start = 0;
        int end = nums.length - 1;
        int element = findMinimum(nums, start, end);
        System.out.println("The minimum element in the array is " + element);
    }

    private static int findMinimum(int[] nums, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
