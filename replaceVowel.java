public class replaceVowel {
  public static void main(String[] args) {
    String str1 = "Hello World";
    String result = str1.replaceAll("[AEIOUaeiou]", "*");
    System.out.println(result.toString());
  }
}
