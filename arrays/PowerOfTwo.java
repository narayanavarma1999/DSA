public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 14;
        boolean result = power(n);
        System.out.println("The result of number " + n + " is " + result);
    }

    private static boolean power(int n) {
        if (n == 1) {
            return true;
        } else if ((n % 2 != 0 || n < 1)) {
            return false;
        }
        return power(n / 2);
    }
}
