import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VowelsCount {

    public static void main(String[] args) {
        String s = "aeiaeia";
        int value = maxFreqSum(s);
        System.out.println("the maximum frequency of vowels and consonant is " + value);
    }

    public static int maxFreqSum(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        Set<Character> seen = new HashSet<Character>();
        for (int i = 0; i < vowels.length; i++) {
            Character character = vowels[i];
            if (!seen.contains(character)) {
                seen.add(character);
            }
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int value = map.get(ch);
                map.put(ch, value + 1);
            }
        }

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (Character character : s.toCharArray()) {
            if (seen.contains(character)) {
                vowelsCount = Math.max((int)(map.get(character)), vowelsCount);
            } else {
                consonantsCount = Math.max((int)(map.get(character)), consonantsCount);
            }
        }

        return vowelsCount + consonantsCount;
    }
}