import java.util.Scanner;

public class maxOfTwo {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first number");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    int max = (num1 > num2) ? num1 : num2;
    System.out.println("The maximum of the two numbers is: " + max);
  }
}
