import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 1, 5, 2 };
        int[] result = cyclicSort(nums);
        System.out.println("The array after implementing cyclic sort is " + Arrays.toString(result));
    }

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
}
