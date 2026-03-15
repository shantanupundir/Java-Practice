class check{
  public int square(int num){
    System.out.println("Square of "+num+" is: "+num*num);
    return 0;
  }
  public int cube(int num){
    System.out.println("Cube of "+num+" is: "+num*num*num);
    return 0;
  }
}
public class cubeSquare {
  public static void main(String args[]){
    check obj = new check();
    obj.square(2);
    obj.cube(2);
  }
}
