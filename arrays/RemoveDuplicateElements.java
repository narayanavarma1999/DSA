import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] result = removeDuplicateElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicateElements(int[] arr) {

        Set<Integer> uniqueElements = new HashSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueElements.contains(arr[i])) {
                uniqueElements.add(arr[i]);
            }
        }

        int[] result = new int[uniqueElements.size()];
        int idx = 0;
        for (Integer num : uniqueElements) {
            result[idx++] = num;
        }
        return result;

    }

}