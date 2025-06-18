import java.util.Arrays;

// public class QuickSort {

//     public static void main(String[] args) {
//         int[] input = { 5, 4, 3, 2, 1 };
//         int start = 0;
//         int end = input.length - 1;
//         quickSort(input, start, end);
//         System.out.println("The resultant output is " + Arrays.toString(input));
//     }

//     private static void quickSort(int[] nums, int start, int end) {
//         if (start >= end) {
//             return;
//         }

//         int low = start;
//         int high = end;
//         int mid = (high + (high - low) / 2);
//         int pivot = nums[mid];

//         while (low < high) {
//             if (nums[low] < nums[pivot]) {
//                 low++;
//             }

//             if (nums[high] > nums[pivot]) {
//                 end--;
//             }

//             if (low <= high) {
//                 int temp = nums[high];
//                 nums[high] = nums[low];
//                 nums[low] = temp;
//             }

//             quickSort(nums, low, high );
//             quickSort(nums, start, end );
//         }

//     }
// }

public class QuickSort {

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot element such that elements smaller than pivot are on left,
            // and elements greater are on right
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose the rightmost element as pivot
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Main method to test the Quick Sort
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
