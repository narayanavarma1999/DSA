

public class BinarySearch {

    public static void main(String[] args) {
        int x = 56;
        int output = mysqrt(x);
        System.out.println("The output of square root of x :" + x + " is " + output);
    }

    private static int mysqrt(int x) {
        int start = 0;
        int end = x / 2;

        int[] nums = new int[end];

        for (int i = 2; i < nums.length; i++) {
            nums[i] = i;
        }

        if (x >= 2) {
            return binarysearch(start, end, nums, x);
        } else {
            return x;
        }
    }

    /*
     * let x = mysqt(10)
     * nums = {2,3,4,5}
     */

    private static int binarysearch(int start, int end, int[] nums, int x) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int sqrx = mid * mid;

            if (sqrx == x) {
                return mid;
            }

            /*
             * 36 > 20
             */

            if (sqrx > x) {
                return binarysearch(start, mid - 1, nums, x);
            } else {
                return binarysearch(mid + 1, end, nums, x);
            }
        }
        return end;
    }
}
