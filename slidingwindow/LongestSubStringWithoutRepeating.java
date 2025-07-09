package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {

        String str = "pwwkew";
        int result = longestSubString(str);
        System.out.println(result);

    }

    private static int longestSubString(String str) {
        Set<Character> seen = new HashSet<>();
        int x = 0;
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            while (seen.contains(ch)) {
                seen.remove(str.charAt(x));
                x++;
            }
            seen.add(ch);
            System.out.println(seen+" "+ x);
            System.out.println(maxLength);
            maxLength = Math.max(maxLength, i - x + 1);
        }
        return maxLength;
    }
        // int n = s.length();
        // Set<Character> seen = new TreeSet();
        // int left = 0, maxLen = 0;

        // for (int right = 0; right < n; right++) {
        // char c = s.charAt(right);
        // while (seen.contains(c)) {
        // seen.remove(s.charAt(left));
        // left++;
        // }
        // seen.add(c);
        // System.out.println(seen);
        // maxLen = Math.max(maxLen, right - left + 1);
        // }

        // return maxLen;
    }

