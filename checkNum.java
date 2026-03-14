import java.util.Scanner;

class check{
  public int num(int a){
    if(a > 0){
      System.out.println("Positive");
      return 0;
    }
    else if(a == 0){
      System.out.println("Zero");
      return 0;
    }
    else{
      System.out.println("Negative");
      return 0;
    }
  }
}
public class checkNum {
  public static void main(String[] args) {
    check obj = new check();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = sc.nextInt();
    obj.num(a);
    
  }
}
