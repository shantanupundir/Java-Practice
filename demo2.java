interface A{
  int age=44;
  String area = "Mumbai"; //final and static
  void show();
  void config();
}
class B implements A{
  public void show(){
    System.out.println("Show method");
  }
  public void config(){
    System.out.println("Config method");
  }
}

public class demo2 {
  public static void main(String[] args) {
    A obj;
    obj = new B();
    obj.show();
    obj.config();

    System.out.println(A.area);
    

  }
}
