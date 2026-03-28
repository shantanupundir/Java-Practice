public class longestWord {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";
    String[] words = str.split(" ");
    String longestWord = "";

    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    System.out.println("The longest word is: " + longestWord);
  }
}
