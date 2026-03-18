import java.util.Scanner;

public class primeTillN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Prime numbers till " + n + ": ");
        for (int num = 2; num <= n; num++) {
            int count = 0;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
