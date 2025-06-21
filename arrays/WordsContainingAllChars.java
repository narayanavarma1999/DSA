import java.util.*;

public class WordsContainingAllChars {
    public static List<String> findWordsWithAllChars(String[] words, String chars) {
        List<String> result = new ArrayList<>();
        Set<Character> requiredChars = new HashSet<>();

        System.out.println("char to array" + Arrays.toString(chars.toCharArray()));

        // Convert string of characters to a set (for quick lookup)
        for (char ch : chars.toCharArray()) {
            requiredChars.add(Character.toLowerCase(ch)); // case-insensitive
        }

        System.out.println("requiredChars" + requiredChars);

        for (String word : words) {
            Set<Character> wordChars = new HashSet<>();
            for (char ch : word.toCharArray()) {
                wordChars.add(Character.toLowerCase(ch)); // case-insensitive
            }

            // Check if all required characters are present in wordChars
            if (wordChars.containsAll(requiredChars)) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = { "apple", "banana", "cherry", "date", "grape" };
        String chars = "ae";

        List<String> matchedWords = findWordsWithAllChars(words, chars);
        System.out.println("Words containing all characters '" + chars + "': " + matchedWords);
    }
}
