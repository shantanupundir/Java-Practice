// public class mulTable {
//   public static void main(String[] args) {
//     int n = 5;
//     for(int i=1; i<=10; i++){
//       System.out.println(n+" x "+i+" = "+(n*i));
//     }
//   }
// }


//All tables from 1 to 10:

public class mulTable {
  public static void main(String[] args) {
    for(int j=1; j<=10; j++){
      System.out.println("Multiplication Table of "+j);
      for(int i=1; i<=10; i++){
        System.out.println(j+" x "+i+" = "+(j*i));
      }
      System.out.println();
    }
  }
}