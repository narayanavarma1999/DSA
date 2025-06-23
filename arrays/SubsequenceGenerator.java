import java.util.*;

public class SubsequenceGenerator {

    public static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, result);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsequences(arr, 0, new ArrayList<>(), result);

        // Print the result
        for (List<Integer> subseq : result) {
            System.out.println(subseq);
        }
    }
}
