import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class anagramCheck {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    if (str1.length() != str2.length()) {
      System.out.println("Not anagrams");
      return;
    }
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    if (Arrays.equals(charArray1, charArray2)) {
      System.out.println("Anagrams");
    } else {
      System.out.println("Not anagrams");
    }

  }
}