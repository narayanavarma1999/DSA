public class LastWordCount {

    public static void main(String[] args) {
        String str = "Hello World ";
        int count = findLastWordCount(str);
        System.out.println("The length of the last word count is " + count);
    }

    private static int findLastWordCount(String str) {
        int n = str.length() - 1;

        // while (n > 0) {
        // if (str.charAt(n) != ' ') {
        // break;
        // }
        // n--;
        // }
        // int count = 0;
        // while (n > 0) {
        // if (str.charAt(n) == ' ') {
        // break;
        // }
        // n--;
        // count++;
        // }
        // return count;

        int count = 0;
        while (n >= 0) {
            if (str.charAt(n) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
            n--;
        }
        return count;
    }
}