import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {
  public static void main(String[] args) {
        String str = "aabbcddeff";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}