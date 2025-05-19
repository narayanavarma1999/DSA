import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;
        //int[] result = twoSum(nums, target);
        twoSum(nums, target);
        int[] result = twoSumUsingHashMap(nums, target);
        System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
    }

    private static int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if ((map.containsKey(diff))) {
                return new int[] { map.get(diff), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int requiredElement = target - element;
            for (int j = 1; j < nums.length; j++) {
                if (requiredElement == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
