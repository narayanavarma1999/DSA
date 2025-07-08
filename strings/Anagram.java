import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String input = "listen";
        String target = "silent";
        boolean output = isAnagram(input, target);
        System.out.println("The two given strings are anagrams " + output);
    }

    private static boolean isAnagram(String input, String target) {

        if (input.length() != target.length()) {
            return false;
        }

        char[] charInput = input.toCharArray();
        char[] charTarget = target.toCharArray();

        Arrays.sort(charInput);
        Arrays.sort(charTarget);

        System.out.println(Arrays.toString(charInput));
        System.out.println(Arrays.toString(charTarget));
        System.out.println(charInput.equals(charTarget));

        return Arrays.equals(charInput, charTarget);
    }
}
