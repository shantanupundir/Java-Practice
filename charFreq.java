import java.util.HashMap;

public class charFreq {
  public static void main(String[] args) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    String str = "helloworld";
    for (char c : str.toCharArray()) {
      if(charCount.containsKey(c)){
        charCount.put(c, charCount.get(c) + 1);
      }else{
        charCount.put(c, 1);
      }
    }
    System.out.println("Character frequencies in the string:");
    for (Character key : charCount.keySet()) {
      System.out.println(key+ ": " + charCount.get(key));
    }
  }
}
