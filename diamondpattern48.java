public class diamondpattern48 {
  public static void main(String[] args) {
    int n =5;
    for(int i=0;i<5;i++){
      for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }
      for(int j=0;j<2*i+1;j++){
        System.out.print("*");
      }
      for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
    for(int i=0;i<5;i++){
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<2*(5-i)-1;j++){
        System.out.print("*");
      }
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
