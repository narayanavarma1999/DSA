import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majoriity {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 6,5,5};
        int output = majorityElement(nums);
        System.out.println(output);
    }
}