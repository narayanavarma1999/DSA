import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] input = { 3, 1, 5, 4, 1, 5, 3 };
        int result = singleNumber(input);
        System.out.println("The single number is" + result);
    }

    private static int singleNumber(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < input.length; i++) {
            if (!map.containsKey(input[i])) {
                map.put(input[i], 1);
            } else {
                int value = map.get(input[i]);
                map.put(input[i], value + 1);
            }
        }

        for (int i = 0; i < input.length; i++) {
            if(map.get(input[i])== 1){
                return input[i];
            }
        }
       
        return -1;
    }
}
