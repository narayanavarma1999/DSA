public class MaxProfitStocks {

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = maxProfitStocks(nums);
        System.out.println("Max profit is :" + maxProfit);
    }

    private static int maxProfitStocks(int[] nums) {
        int minPrice = nums[0];
        int profit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }
            int diff = nums[i] - minPrice;
            profit = Math.max(profit, diff);
        }
        return profit;
    }

}
