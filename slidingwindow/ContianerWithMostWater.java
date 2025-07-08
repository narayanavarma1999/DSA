package slidingwindow;

public class ContianerWithMostWater {

    public static void main(String[] args) {
        int[] input = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int area = findMaxArea(input);
        System.out.println("The maximum amount of water that can be contained in the container is " + area);
    }

    /*
     * private static int findMaxArea(int[] input) {
     * int maxArea = 0;
     * for (int i = 0; i < input.length; i++) {
     * for (int j = 0; j < input.length; j++) {
     * int area = Math.abs(j - i) * (Math.min(input[i], input[j]));
     * maxArea = Math.max(maxArea, area);
     * }
     * }
     * return maxArea;
     * }
     */

    private static int findMaxArea(int[] input) {
        int i = 0;
        int j = input.length - 1;
        int area = 0;
        int maxArea = 0;
        while (i < j) {
            area = (j - i) * Math.min(input[i], input[j]);
            maxArea = Math.max(area, maxArea);
            if (input[i] < input[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
