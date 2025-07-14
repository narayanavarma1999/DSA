
import java.util.LinkedList;
import java.util.List;

public class Subset {
    
    public static void main(String[] args) {
        int[] input = {3,5,9};
        List<List<Integer>> result =  findSubsets(input);
        System.out.println("All combinations of subsets are "+ result);
    }

    private static List<List<Integer>> findSubsets(int[] input){
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < input.length; i++) {
            List<Integer> list = new LinkedList<>();
            for (int j = i; j < input.length; j++) {
                list.add(input[j]);
            }   
            result.add(list);
        }
        return result;
    }
}
