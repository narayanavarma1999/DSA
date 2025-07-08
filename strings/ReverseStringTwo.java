public class ReverseStringTwo {

    /*
     * problem : -> for 2k size elements reverse first k sixe elements
     * and if still they are any elements left by of k size reverse all of them and
     * if elements are left are greater than k and less than of 2k reverse first k
     * and
     * keep the original string.
     */
    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        String output = reverseString(str, k);
        System.out.println("The reverse of the input string " + output);
    }

    private static String reverseString(String str, int k) {
        int n = str.length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < n - 1; i+=(2*k)) {
            int start = i;
            int end = Math.min((i + k - 1), (n - 1));
            System.out.println("END"+end);
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
