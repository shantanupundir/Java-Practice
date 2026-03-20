public class starSpace47 {
  public static void main(String[] args) {
    int n =5;
    int i =1;
    for (i = 1; i <= n; i++) {
      int space =i-1;
      for (int k = 1; k < i; k++) {
        System.out.print(" ");
      }
      for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
      System.out.println();
    }
  }
}
