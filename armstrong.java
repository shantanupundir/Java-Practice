import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    String num = Integer.toString(n);
    int len = num.length();
    int result = 0;
    for (char c:num.toCharArray()){
      result += (int)Math.pow(c - '0', len);
    }
    if (result == n){
      System.out.println(n + " is an armstrong number");
    } else {
      System.out.println(n + " is not an armstrong number");
    }
  }
}
