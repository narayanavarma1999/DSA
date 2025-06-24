package recursion;

public class PowerFunction {

    public double myPow(double x, int n) {

        long N = n; // To handle Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;

        while (N > 0) {
            if ((N % 2) == 1) { // If N is odd
                result *= x;
            }
            x *= x; // Square the base
            N /= 2; // Divide exponent by 2
        }
        return result;
    }

    public static void main(String[] args) {
        PowerFunction pf = new PowerFunction();
        // System.out.println(pf.myPow(2.0, 10)); // 1024.0
        System.out.println(pf.myPow(2.0, -2)); // 0.25
    }
}
