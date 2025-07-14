

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        int start = 0;
        int end = nums.length;
        int index = search(nums, target, start, end);
        System.out.printf("The target element " + target + "  is at index " + index);
    }

    private static int search(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + (end - start) / 2);
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] > target) {
            return search(nums, target, mid + 1, end);
        } else {
            return search(nums, target, start, mid - 1);
        }
    }

}
