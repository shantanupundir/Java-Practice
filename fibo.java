import java.util.Scanner;

public class fibo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = sc.nextInt();
    int prev2 = 0;
    int prev1 = 1;
    int curr = 0;
    System.out.print("Fibonacci Series: ");
    for(int i =0 ;i<n; i++){
      if(i==0){
        curr = 0;
      }
      else if(i==1){
        curr = 1;
      }
      else{
        curr = prev1 + prev2;
      }
      System.out.print(curr + " ");
      prev2 = prev1;
      prev1 = curr;
    }
  }
}
