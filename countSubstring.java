public class countSubstring {
  public static void main(String[] args) {
    String str = "abcab";
    int n = str.length();
    int count = n* (n+1)/2;
    System.out.println("Total number of substrings: " + count);
  }
}
