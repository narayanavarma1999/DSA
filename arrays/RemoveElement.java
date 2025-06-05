import java.util.LinkedList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int target = 2;
        int result = removeTargetElement(arr, target);
        System.out.println("result is :" + result);
    }

    private static int removeTargetElement(int[] arr, int target) {
        List<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.remove(Integer.valueOf(arr[i]));
            }
        }
        System.out.println(list);
        return list.size();
    }
}