public class IsSubsequence {

    public static void main(String[] args) {
        String str = "abcdef";
        String substr = "abc";
        boolean output = IsSubsequence(str, substr);
        System.out.println(output);
    }

    private static boolean IsSubsequence(String str, String substr) {
        int subIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char str1 = str.charAt(i);
            char str2 = substr.charAt(subIndex);
            if (str1 == str2) {
                subIndex++;
                if (subIndex == substr.length()) {
                    return true;
                }
            }
        }
        return false;
    }

}
