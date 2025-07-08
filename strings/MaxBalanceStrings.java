public class MaxBalanceStrings {

    public static void main(String[] args) {
        String str = "LLLLRRRR";
        int max = findMaxBalanceStringd(str);
        System.out.println("The maximum count of balance strings are: " + max);
    }

    private static int findMaxBalanceStringd(String str) {
        int rcount = 0;
        int lcount = 0;
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'L') {
                lcount++;
            } else {
                rcount++;
            }
            if (rcount == lcount) {
                maxCount++;
                rcount = 0;
                lcount = 0;
            }
        }
        return maxCount;
    }
}
