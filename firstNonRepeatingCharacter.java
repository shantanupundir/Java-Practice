import java.util.HashMap;

public class firstNonRepeatingCharacter {
  public static void main(String[] args) {
    String str = "abbbbccdde";
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (char c : str.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0)+1);
    }
    for (char c : str.toCharArray()) {
      if (charCount.get(c) == 1) {
        System.out.println("First non-repeating character: " + c);
        return;
      }
    }
    System.out.println("No non-repeating character found");
  }
}
