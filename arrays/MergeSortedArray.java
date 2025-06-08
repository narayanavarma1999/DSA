import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        int[] result = mergeSortedArray(nums1, nums2, m, n);
        System.out.println("Sorted Array is " + Arrays.toString(result));
    }

    public static int[] mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {

        int i = 0;
        for (int j = 0; j < m + n - 1; j++) {
            if (nums1[j] >= nums2[i]) {
                nums1[i++] = nums2[j];
            }
        }

        return nums1;

    }
}
