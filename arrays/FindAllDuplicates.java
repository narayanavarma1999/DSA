import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] input = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = allDuplicates(input);
        System.out.println("The duplicates elements are :" + result);
    }

    private static List<Integer> allDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]) {
                swap(nums, i, currentIndex);
            } else {
                i++;
            }
        }

        System.out.println("Array is " + Arrays.toString(nums));

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }

        return list;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
