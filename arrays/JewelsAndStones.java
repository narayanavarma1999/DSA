import java.util.LinkedList;
import java.util.List;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = findJewels(jewels, stones);
        System.out.println("count"+ count);
    }

    private static int findJewels(String jewels, String stones) {
        List<Character> list = new LinkedList<>();
        for (char letter : jewels.toCharArray()) {
            list.add(letter);
        }

        int count =0;
        for (int i = 0; i < stones.length(); i++) {
         
            for (Character character : stones.toCharArray()) {
                
            }
        }

        return 0;
    }
}
