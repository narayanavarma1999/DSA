
class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        int index = linearSearch(arr, target);
        System.out.println("Index of Target is :" + index);
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}