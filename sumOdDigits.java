import java.util.Scanner;

public class sumOdDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    String str = Integer.toString(num);
    int arr[] = new int[str.length()];
    int sum = 0;
    for( int i=0; i<str.length(); i++){
      arr[i] = str.charAt(i) - '0';
    }
    for( int i=0; i<arr.length; i++){
      sum = sum + arr[i];
    }
    System.out.println("The sum of digits is: " + sum);
  }
}
