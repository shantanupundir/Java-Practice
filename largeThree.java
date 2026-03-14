class check{
  public int largest(int a, int b, int c){
    if(a>b && a>c){
      return a;
    }
    else if(b>a && b>c){
      return b;
    }
    else{
      return c;
    }
  }
}
public class largeThree {
  public static void main(String[] args) {
    check obj = new check();
    int a = 10;
    int b = 20;
    int c = 30;
    System.out.println(obj.largest(a, b, c));
  }
}
