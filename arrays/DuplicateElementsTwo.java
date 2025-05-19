import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsTwo {

    public static void main(String[] args) {
        int[] nums = { 0, 5, 2, 7, 3, 1, 3 };
        int size = 3;
        boolean result = checkDuplicateExists(nums, size);
        System.out.println("In the given array in a range of " + size + " there exists "
                + (result ? "duplicate" : "no duplicate") + " elements ");
    }

    private static boolean checkDuplicateExists(int[] nums, int size) {
        Set<Integer> window = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            } else {
                window.add(nums[i]);
            }
            if (window.size() > size) {
                window.remove(i - size);
            }
        }
        return false;
    }
}
