import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {

    public static void main(String[] args) {
        int[][] oranges = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        int time = findMinutesForRottingOranges(oranges);
        System.out.println("The time taken to rotten all oranges is " + time);
    }

    private static int findMinutesForRottingOranges(int[][] oranges) {
        int n = oranges.length;
        int[][] rottenOranges = new int[1][n];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < oranges.length; i++) {
            for (int j = 0; j < oranges.length; j++) {
                if (oranges[i][j] == 2) { 
                    //queue(new int[i][j]);
                }
            }
        }

        System.out.println(queue);
        return 0;
    }
}
