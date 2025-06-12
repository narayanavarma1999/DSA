import java.util.ArrayList;
import java.util.Arrays;

public class MultipleMissingNumbers {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] result = findMissingNumbers(nums);
        System.out.println("The missing numbers are :" + Arrays.toString(result));
    }

    public static int[] findMissingNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }
        }

        System.out.println("The new array is " + Arrays.toString(nums));

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 1; j < nums.length - 1; j++) {
            if (nums[j - 1] != j) {
                list.add(Integer.valueOf(j));
            }
        }

        System.out.println("The list is " + list);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        // int[] arr = new int[list.size()];
        // for (int k = 0; k < list.size(); k++) {
        //     arr[k] = list.get(k);
        // }

        return arr;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
}
