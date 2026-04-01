import java.util.Scanner;

public class fibonacciTillN {
  public static void main(String[] args) {
    int prev1 = 0;
    int prev2 = 1;
    int sum = 0;
    int largestNumGenerated = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    System.out.print("Fibonacci series till " + n + ": ");
    for (int i = 0; i < n; i++) {
      System.out.print(prev1 + " ");
      int temp = prev1;
      prev1 = prev2;
      prev2 = temp + prev2;
      sum += temp;
      if (temp > largestNumGenerated) {
        largestNumGenerated = temp;
      }

    }
    System.out.println("Sum of Fibonacci series till " + n + ": " + sum);
    System.out.println("Largest number generated in the series: " + largestNumGenerated);
  }
}
