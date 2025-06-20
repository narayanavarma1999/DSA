public class Fibanoci {
    public static void main(String[] args) {
        int n = 10;
        int result = fibanoci(n);
        System.out.println("The resulted fibonaci sum is " + result);
    }

    private static int fibanoci(int n) {
        if (n < 2) {
            return n;
        }
        System.out.print(" " + n);
        return fibanoci(n - 1) + fibanoci(n - 2);
    }
}

// index - 0  1  2  3  4  5  6  7   8   9   10
// value - 0  1  1. 2. 3  5. 8. 13  21.  34. 55

