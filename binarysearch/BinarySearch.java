package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int x = 20;
        int output = mysqrt(x);
        System.out.println("The output of square root of x " + x + " is "+ output);
    }

    private static int mysqrt(int x) {
        if (x >= 2) {
            return binarysearch(2, x / 2, x * x);
        } else {
            return x;
        }
    }

    private static int binarysearch(int start, int end, int target) {

        int mid = start + (end - start) / 2;

        int ans = mid * mid;

        if (mid == ans) {
            return mid;
        }

        if (ans > target) {
            return binarysearch(mid + 1, end, target);
        } else {
            return binarysearch(start, mid - 1, target);
        }

    }
}
