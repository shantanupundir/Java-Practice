class check {
  public double area(double r){
    System.out.println("Area of circle is: " + 3.14 * r * r);
    return 0;
  }
}
public class areaCircle {
  public static void main(String args[]){
    check obj = new check();
    obj.area(2.5);
  }
}
