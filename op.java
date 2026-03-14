class operations {
  public int main(int a, int b){
    System.out.println(a+b);
    return 0;
  }
  public int sub(int a, int b){
    System.out.println(a-b);
    return 0;
  }
  public int mul(int a, int b){
    System.out.println(a*b);
    return 0;
  }
  public int div(int a, int b){
    System.out.println(a/b);
    return 0;
  }
}


public class op {
  public static  void main(String[] args) {
    operations obj = new operations();
    obj.main(10, 20);
    obj.sub(10, 20);
    obj.mul(10, 20);
    obj.div(10, 20);
  }
}
