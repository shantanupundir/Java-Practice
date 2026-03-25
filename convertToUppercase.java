public class convertToUppercase {
  public static void main(String[] args) {
    String str = "hello world";
    String upperStr = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        upperStr += (char) (ch - 32);
      } else {
        upperStr += ch;
      }
    }
    System.out.println(upperStr);
  }
}