import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(" output " + findMissingElements(nums));
    }

    private static List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> miss = new ArrayList<>();
        int next = 1;
        for (int v : nums) {
            while (next < v) {
                miss.add(next++);
            }

            if (next == v) {
                next++;
            }
        }
        while (next <= nums.length)
            miss.add(next++);

        return miss;
    }
}
