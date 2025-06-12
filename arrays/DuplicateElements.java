import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4,2 };
        boolean result = findDuplicateExists(nums);
        System.out.println("The nums contains the " + (result ? "duplicate" : "no duplicate") + " elements");
    }

    private static boolean findDuplicateExists(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
