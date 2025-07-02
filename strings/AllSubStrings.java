import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllSubStrings {

    /*
     * To find all the substrings of string length n ,
     * there woulf be n(n+1)/2 number of substrings
     */

    public static void main(String[] args) {
        String str = "abcd";
        List<String> result = findAllStringsBrute(str);
        System.out.println("The all substrings of the string are " + result);
    }

    private static List<String> findAllSubStrings(String str) {
        List<String> result = new LinkedList<>();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }
        return result;
    }

    private static List<String> findAllStringsBrute(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    sb.append(s.charAt(k));
                }
                res.add(sb.toString());
            }
        }
        return res;
    }

}