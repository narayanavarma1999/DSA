package binarysearch;

public class BadVersion {

    /*
     * Problem statement : A product is designed and for every bad design and there
     * would be further modifications and released in the next
     * versions find the first bad version product . the function isBadVersion
     * returns the results
     * 
     * Ex: input = 5 ,Bad = 4
     * -> isBadVersion(3) - false
     * -> isBadVersion(4) - true
     * -> isBadVersion(5) - true
     * 
     * Here the first bad version is 4 so output is 4
     */

    public static void main(String[] args) {

        int n = 5;
        int out = findFirstBadVersion(n);
        System.out.println("The first bad version product is " + out);

    }

    private static boolean isBadVersion(int n) {
        if (n >= 4) {
            return true;
        }
        return false;
    }

    private static int findFirstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return right;
    }

}
