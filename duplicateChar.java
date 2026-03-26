public class duplicateChar {
  public static void main(String[] args) {
    String str = "hello world";
    String dup = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (dup.indexOf(ch) == -1) {
        dup += ch;
      }
    }
    System.out.println(dup);
  }
}
