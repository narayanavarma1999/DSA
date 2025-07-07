import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AllSubArrays {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 1, 5);
        List<List<Integer>> output = findAllSubArrays(nums);
        System.out.println("The possible subarrays are " + output);

    }

    private static List<List<Integer>> findAllSubArrays(List<Integer> nums) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                list.add(new LinkedList<Integer>(nums.subList(i, j + 1)));
            }
        }
        return list;
    }
}
