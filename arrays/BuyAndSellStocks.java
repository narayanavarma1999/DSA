public class BuyAndSellStocks {

    public static void main(String[] args) {
        int[] input = { 7, 1, 5, 3, 6, 4 };
        int result = calculateProfit(input);
        System.out.println("Maximum profit inccured is " + result);
    }

    private static int calculateProfit(int[] input) {
        int maxProfit = 0;
        for (int i = 0; i < input.length; i++) {
            int min = input[i];
            for (int j = i + 1; j < input.length; j++) {
                maxProfit = Math.max(maxProfit, input[j] - min);
            }
        }
        return maxProfit;
    }

}