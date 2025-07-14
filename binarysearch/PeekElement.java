

public class PeekElement {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        int start = 0;
        int end = nums.length;
        int output = findPeek(nums, start, end);
        System.out.println("The peek element in the array using binary search is " + output);
    }

    private static int findPeek(int[] nums, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
