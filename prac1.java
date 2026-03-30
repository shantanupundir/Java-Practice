public class prac1 {
    public void reverse(String s){
      for(int i=s.length()-1;i>=0;i--){
          System.out.print(s.charAt(i));
      }
      System.out.println();
    }
    public void palindrome(String s){
      String rev = "";
      for(int i=s.length()-1;i>=0;i--){
          rev = rev + s.charAt(i);
      }
      if ((s.equals(rev))) {
          System.out.println("The string is a palindrome.");
      } else {
          System.out.println("The string is not a palindrome.");
      }
    }
    public static void main(String[] args) {
        prac1 obj = new prac1();
        obj.reverse("Hello, World!");
        System.out.println("Checking if palindrome:");
        obj.palindrome("race");
    }
}
