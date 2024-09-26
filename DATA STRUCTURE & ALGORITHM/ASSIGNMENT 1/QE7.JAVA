import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class QE7 {

    public static List<Character> findRepeatedCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        List<Character> repeatedChars = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > 1) {
                repeatedChars.add(ch);
            }
        }

        return repeatedChars;
    }

    public static void main(String[] args) {
        String testCase1 = "programming";
        String testCase2 = "hello";

        System.out.println("Repeated characters in \"" + testCase1 + "\": " + findRepeatedCharacters(testCase1)); // Output: [r, g, m]
        System.out.println("Repeated characters in \"" + testCase2 + "\": " + findRepeatedCharacters(testCase2)); // Output: [l]
    }
}
