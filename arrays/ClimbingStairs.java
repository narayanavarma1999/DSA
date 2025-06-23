import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 10;
        int result = ClimbingStairs.bottomTop(n);
        int value = ClimbingStairs.fib(n);
        System.out.println("The number of steps to reach " + n + " steps stairs are " + result + " value "+ value);
    }

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(Arrays.toString(dp));
        }
        return dp[n];
    }

    /*
     * 
     * memorization top to bottom approach
     *
     */
    static int[] memo = new int[11];

    public static int fib(int n) {
        if (n < 2)
            return n;
        if (memo[n] != 0)
            return memo[n];
        memo[n] = fib(n - 1) + fib(n - 2);
        System.out.println(Arrays.toString(memo));
        return memo[n];
    }

    public static int bottomTop(int n) {

        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

}

/*
 * 1 1 1 1 1
 * 1 2 3 4 5 
 */
