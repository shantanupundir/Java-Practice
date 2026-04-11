import java.util.Scanner;

public class ques2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter till N: ");
    int n = sc.nextInt();
    int firstnum =0 ;
    int secondnum = 1;
    int sum=0;
    for(int i=0; i<n; i++){
      System.out.print(firstnum + " ");
      sum += firstnum;
      int nextnum = firstnum + secondnum;
      firstnum = secondnum;
      secondnum = nextnum;

    }
    System.out.println("\nSum of Fibonacci series: " + sum);

  }
}
