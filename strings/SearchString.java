public class SearchString {

    public static void main(String[] args) {
        String str = "saturdaysad";
        String target = "sad";
        int index = findFirstIndex(str, target);
        System.out.println("The index of the first occurence of the matched string is " + index);
    }

    private static int findFirstIndex(String str, String target) {
        int nLength = str.length();
        int tLength = target.length();

        for (int i = 0; i < nLength - tLength + 1; i++) {
            String str1 = str.substring(i, i + tLength);
            System.out.println(" " + str1 + " ->>>  " + target);
            if (str1.equals(target)) {
                return i;
            }
        }
        return -1;

    }
}
