import java.util.Scanner;

public class countDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    String str = Integer.toString(num);
    int count = str.length();
    System.out.println("Number of digits: " + count);
  }
}
