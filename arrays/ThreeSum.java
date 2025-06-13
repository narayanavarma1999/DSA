import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // Input: nums = [-1,0,1,2,-1,-4]
        // Output: [[-1,-1,2],[-1,0,1]]

        List<List<Integer>> result = threeSum(nums);
        System.out.println("List is " + result);

    }

    /*
     * brute force approach
     */
    /*
     * private static Set<List<Integer>> threeSum(int[] nums) {
     * 
     * Set<List<Integer>> list = new HashSet();
     * for (int i = 0; i < nums.length - 2; i++) {
     * for (int j = i + 1; j < nums.length - 1; j++) {
     * for (int k = j + 1; k < nums.length; k++) {
     * int sum = nums[i] + nums[j] + nums[k];
     * if (sum == 0) {
     * List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
     * Collections.sort(triplet);
     * list.add(triplet);
     * }
     * }
     * }
     * }
     * return list;
     * }
     */

    /*
     * Hash set approach
     */
    /*
     * private static Set<List<Integer>> threeSum(int[] nums) {
     * Arrays.sort(nums);
     * Set<List<Integer>> list = new HashSet();
     * System.out.println(Arrays.toString(nums));
     * 
     * Set<Integer> seen = new HashSet<>();
     * 
     * for (int i = 0; i < nums.length - 2; i++) {
     * 
     * for (int j = i + 1; j < nums.length; j++) {
     * int complement = -nums[i] - nums[j];
     * if (!seen.contains(complement)) {
     * List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
     * Collections.sort(triplet);
     * list.add(triplet);
     * }
     * seen.add(nums[j]);
     * }
     * }
     * 
     * return list;
     * 
     * }
     */

    /*
     * two pointer approach
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}
