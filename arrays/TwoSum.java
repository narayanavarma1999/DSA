import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 3, 5,11, 15 };
        int target = 9;
        // int[] result = twoSum(nums, target);
        twoSum(nums, target);
        int[] result = twoPointeSum(nums, target);
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

    private static int[] twoSumOne(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            } else {
                return new int[] { i, map.get(complement) };
            }
        }
        return new int[] { -1, -1 };
    }

    private static int[] twoPointeSum(int[] nums, int target) {
        int n = nums.length;
        // Step 1: Store value and original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i; // index
        }

        // Step 2: Sort based on value
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        
        System.out.println("The resultant array is " + Arrays.deepToString(arr));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[] { arr[left][1], arr[right][1] }; // original indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;    

    }
}
