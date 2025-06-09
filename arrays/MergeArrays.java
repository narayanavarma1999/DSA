import java.util.Arrays;

public class MergeArrays {

    public static void main(String args[]) {

        int m = 3;
        int n = 3;
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int[] result = mergeArrays(nums1, nums2, m, n);
        System.out.println("The resultant array is " + Arrays.toString(result));
    }

    public static int[] mergeArrays(int[] nums1, int[] num2, int m, int n) {
    
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (p2 >= 0 && (num2[p2] > nums1[p1])) {
                nums1[i] = num2[p2];
                p2--;
            } else {
                nums1[i] = nums1[p1];
                p1--;
            }
        }
        return nums1;
    }

}
