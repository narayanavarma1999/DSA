public class BinarySearch {

    public static void main(String[] args) {
        int[] input = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int result = binarySearch(input, target);
        System.out.println("The resultant binary search element index is " + result);
    }

    private static int binarySearch(int[] input, int target) {

        int left = 0;
        int right = input.length - 1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);

            if (input[mid] == target) {
                return mid;
            }

            if (input[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}