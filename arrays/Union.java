import java.lang.reflect.Array;
import java.util.Arrays;

public class Union {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 5, 6 };
        int[] nums2 = { 2, 3, 5, 7 };
        int[] output = unionArray(nums1, nums2);
        System.out.println("Resultant array is " + Arrays.toString(output));
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int index = 0;
        int[] result = new int[n + m];
        while (i < n && j < m) {

            int last = result[index];

            if (nums1[i] < nums2[j]) {
                if (nums1[i] != last || result.length == 0) {
                    result[index++] = nums1[i++];
                }
            } else if (nums2[j] < nums1[i]) {
                if (nums2[i] != last || result.length == 0) {
                    result[index++] = nums2[j++];
                }
            }
        }

        while (i < n) {
            result[index++] = nums1[i++];
        }

        while (j < n) {
            result[index++] = nums2[j++];
        }

        return result;
    }

}
