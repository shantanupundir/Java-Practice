import java.util.Scanner;

public class miniProb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String sentence = sc.nextLine();
    //count words
    String[] words = sentence.split(" ");
    System.out.println("Number of words: " + words.length);
    int maxLength = 0;
    String longestWord = "";
    for (String word : words) {
      if (word.length() > maxLength) {
        maxLength = word.length();
        longestWord = word;
      }
    }
    System.out.println("Longest word: " + longestWord);
    //shortest word
    int shortMaxLength = Integer.MAX_VALUE;
    String shortWord = "";
    for (String word : words) {
      if (word.length() < shortMaxLength) {
        shortMaxLength = word.length();
        shortWord = word;
      }
    }
    System.out.println("Shortest word: " + shortWord);


    //count vowels in a string
    int vowelCount = 0;
    for (char c : sentence.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        vowelCount++;
      }
    }
    System.out.println("Total vowels: " + vowelCount);
  }
}