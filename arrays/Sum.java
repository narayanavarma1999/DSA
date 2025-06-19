public class Sum {
   
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("The resultant sum of first " + n + " numbers is " + result);
    }

    private static int sum(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

}
