public class MergeSort {

    // Main function that sorts arr[l..r] using merge()
    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = nums[start + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }

    }

    /*
     * // Merges two subarrays of arr[].
     * // First subarray is arr[l..m]
     * // Second subarray is arr[m+1..r]
     * public void merge(int[] arr, int l, int m, int r) {
     * // Sizes of two subarrays to be merged
     * int n1 = m - l + 1;
     * int n2 = r - m;
     * 
     * // Create temporary arrays
     * int[] L = new int[n1];
     * int[] R = new int[n2];
     * 
     * // Copy data to temp arrays
     * for (int i = 0; i < n1; i++)
     * L[i] = arr[l + i];
     * for (int j = 0; j < n2; j++)
     * R[j] = arr[m + 1 + j];
     * 
     * // Merge the temp arrays
     * 
     * int i = 0, j = 0;
     * int k = l; // Initial index of merged subarray
     * 
     * while (i < n1 && j < n2) {
     * if (L[i] <= R[j]) {
     * arr[k] = L[i];
     * i++;
     * } else {
     * arr[k] = R[j];
     * j++;
     * }
     * k++;
     * }
     * 
     * // Copy remaining elements of L[] if any
     * while (i < n1) {
     * arr[k] = L[i];
     * i++;
     * k++;
     * }
     * 
     * // Copy remaining elements of R[] if any
     * while (j < n2) {
     * arr[k] = R[j];
     * j++;
     * k++;
     * }
     * }
     */
    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
