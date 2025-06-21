import java.util.Arrays;

public class WordsContainingLetter {

    public static void main(String[] args) {
        String[] words = { "leet", "code", "Apple", "Cat" };
        String letter = "e";
        int[] count = findWordsContainingLetter(words, letter);
        System.out.println("The indicies words containig the letter " + letter + " are " + Arrays.toString(count));
    }

    private static int[] findWordsContainingLetter(String[] words, String letter) {
        int[] count = new int[words.length];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(letter)) {
                count[j++] = i;
            }
        }
        return count;
    }
}
