public class spacestar46 {
  public static void main(String[] args) {
    int i = 1;
    int n = 5;
    for (i = 1; i <= 5; i++) {
      int space = n - i;
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
