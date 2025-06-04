public class ReverseNumber {

    public static void main(String[] args) {
        int n = 1432;
        int result = reverse(n);
        System.out.println("reverse of number " + n + " is " + result);
    }

    private static int reverse(int n) {
        int digit = n;
        int rev = 0;    
        int rem = 0;
        while (digit != 0) {
            rem = digit % 10;
            rev = rev * 10 + rem;
            digit = digit / 10;
        }
        return rev;
    }
}