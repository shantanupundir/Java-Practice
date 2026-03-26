import java.util.HashMap;
import java.util.Map;

public class cFreq {
  public static void main(String[] args) {
    Map<Character, Integer> freqMap = new HashMap<>();
    String str = "hello world";
    for (char ch : str.toCharArray()) {
      if (ch != ' ') {
        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
      }
    }
    System.out.println(freqMap);
  }
}
