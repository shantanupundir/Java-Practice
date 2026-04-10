class op{
  void palindrome(int num){
    String str = Integer.toString(num);
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }
    if (str.equals(reverse)) {
      System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
    }
  }
  boolean prime(int num){
    boolean isPrime = true;
    if (num <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    System.out.println(isPrime);
    return isPrime;
    
  }
}
public class ques1 {
  public static void main(String[] args) {
    op obj = new op();
    obj.palindrome(131);
    obj.prime(131);
  }
}
