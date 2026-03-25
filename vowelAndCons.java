public class vowelAndCons {
  public static void main(String[] args) {
    String str = "hello world";
    String lowerStr = str.toLowerCase();
    int vowelCount = 0;
    int consCount = 0;
    for (int i = 0; i < lowerStr.length(); i++) {
      char ch = lowerStr.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
      } else if (ch >= 'a' && ch <= 'z') {
        consCount++;
      }
    }
    System.out.println("Vowels: " + vowelCount);
    System.out.println("Consonants: " + consCount);
  }
}
