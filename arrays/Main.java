import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 3, 4, 5);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        // Print array elements
        for (int num : array) {
            System.out.println(num);
        }
    }
}
