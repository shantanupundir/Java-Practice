import java.util.Scanner;

public class prac2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a range: ");
      int n = sc.nextInt();
      System.out.println("Prime numbers in the range 1 to " + n + ":");
      for (int i = 2; i <= n; i++) {
        int count = 0;
        for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
          }
  }
}
