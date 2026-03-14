class Human{
  private String name = "Navin";
  private int age = 11;

public int getAge() {
  return age;
}

public String getName() {
  return name;

}
}

public class hello  {
  public static void main(String[] args) {
    Human obj = new Human();
    // obj.age = 11;
    // obj.name = "Navin";
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
  }
}
