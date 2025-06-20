import java.util.Arrays;

public class SortBinaryArray {
    public static void sortBinary(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until we find a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }
            // Move right pointer until we find a 0
            while (arr[right] == 1 && left < right) {
                right--;

                // Swap if left is still less than right
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }

        // int i = 0;
        // int j = 0;
        // int n = arr.length;

        // while (i < n) {
        // if (arr[i] == 0) {
        // swap(arr, i, j);
        // j++;
        // }
        // i++;
        // }

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };
        sortBinary(arr);
        System.out.println(Arrays.toString(arr));
    }
}
