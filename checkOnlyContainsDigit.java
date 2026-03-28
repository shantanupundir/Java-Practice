public class checkOnlyContainsDigit {
  public static void main(String[] args) {
    String str1 = "12345";
    int count = 0;
    for (char ch : str1.toCharArray()) {
      if (Character.isDigit(ch)) {
        count++;
      }
    }
    if (count == str1.length()) {
      System.out.println("The string contains only digits.");
    } else {
      System.out.println("The string does not contain only digits.");
    }
  }
}
