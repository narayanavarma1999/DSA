import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RottenOranges {

    public static void main(String[] args) {
        int[][] oranges = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 2 } };
        int output = findRottenOranges(oranges);
        System.out.println("The output of the rotten oranges is " + (output));
    }

    private static int findRottenOranges(int[][] oranges) {
        int m = oranges.length;
        int n = oranges[0].length;
        int maxLevel = 0;

        Stack<List<Integer>> stack = new Stack<>();

        for (int i = 0; i < oranges.length; i++) {
            for (int j = 0; j < oranges.length; j++) {
                if (oranges[i][j] == 2) {
                    stack.add(Arrays.asList(i, j, 0));
                }
            }
        }

        System.out.println("stack" + stack.size());

        while (stack.size() != 0) {

            List<Integer> popedOrange = stack.pop();

            int x = popedOrange.get(0);
            int y = popedOrange.get(1);
            int level = popedOrange.get(2);

            System.out.println("LEVEL " + level);

            /*
             * top shift
             */
            if (x > 0 && oranges[x - 1][y] == 1) {
                oranges[x - 1][y] = 2;
                stack.add(Arrays.asList(x - 1, y, level + 1));
            }

            /*
             * bottom shift
             */
            if (x < m - 1 && oranges[x + 1][y] == 1) {
                oranges[x + 1][y] = 2;
                stack.add(Arrays.asList(x + 1, y, level + 1));
            }

            /*
             * left shift
             */
            if (y > 0 && oranges[x][y - 1] == 1) {
                oranges[x][y - 1] = 2;
                stack.add(Arrays.asList(x, y - 1, level + 1));
            }

            /*
             * right shift
             */
            if (y < n - 1 && oranges[x][y + 1] == 1) {
                oranges[x][y + 1] = 2;
                stack.add(Arrays.asList(x, y + 1, level + 1));
            }
            maxLevel = Math.max(maxLevel, level);
        }

        return maxLevel;
    }
}
