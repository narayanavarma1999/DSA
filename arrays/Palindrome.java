public class Palindrome {

    public static void main(String[] args) {
        int n = 222;
        boolean check = isPalindrome(n);
        System.out.println("check value is "+ check);
        System.out.println("The number " + n + " is " + (check ? "Palindrome" : "Not a Palindrome"));
    }

    private static boolean isPalindrome(int n) {
        int result = 0;
        int rem = 0;
        int digit = n;
        while (digit > 0) {
            rem = digit % 10;
            result = result * 10 + rem;
            digit = digit / 10;
        }
        System.out.println(result);
        System.out.println("result of n is "+ n  + " validation is "+  (n==result));
        return result == n;

    }
}