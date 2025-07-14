

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "eidbaooo";
        String s2 = "ab";
        boolean output = findPermutation(s1, s2);
        System.out.println("the permutation exists" + output);
    }

    private static boolean findPermutation(String s1, String s2) {
        int i = 0;
        int n = s1.length();
        int k = s2.length();

        for (int j = 0; j < n; j++) {
            String s1Result = "";
            i = j;
            while (i < j + k) {
                s1Result += s1.charAt(i);
                i++;
            }

            System.out.println("s1Result"+s1Result+"s2"+ sortString(s2));

            if (sortString(s1Result).equals(sortString(s2))) {
                return true;
            }
        }
        return false;
    }

    private static String sortString(String s) {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        String finalTarget = new String(result);
        return finalTarget;
    }
}
