//Getter and setter in java
// class Human {
//   private String name = "Navin";
//   private int age = 11;

//   public int getAge() {
//     return age;
//   }

//   public String getName() {
//     return name;

//   }
// }

// public class hello {
//   public static void main(String[] args) {
//     Human obj = new Human();
//     // obj.age = 11;
//     // obj.name = "Navin";
//     System.out.println(obj.getAge());
//     System.out.println(obj.getName());
//   }
// }




//This() and super() in java
// class A{

// }
// class B extends A{
//   public B(){
//     System.out.println("Constructor of B");
//   }
// }

// public class Demo{
//   public static void main(String[] args) {
//     B obj = new B();
//   }
// }


// Inheritance in java

// class Calc{
//   public int add(int a, int b){
//     return a+b;
//   }

//   public int sub(int a, int b){
//     return a-b;
//   }

//   public int mul(int a, int b){
//     return a*b;
//   }
// }
// class AdCalc extends Calc{
//   public int div(int a, int b){
//     return a/b;
//   }
// }


// public class Demo{
//   public static void main(String[] args) {
//     AdCalc obj = new AdCalc();
//     System.out.println(obj.add(2, 3));
//     System.out.println(obj.sub(2, 3));
//     System.out.println(obj.mul(2, 3));
//     System.out.println(obj.div(2, 3));
//   }
// }


class family{
  public void surname(){
    System.out.println("Thakur");
  }
}
class child extends family{
  public void name(){
    System.out.println("Navin");
  }
}
class Demo{
  public static void main(String args[]){
    child obj = new child();
    obj.surname();
    obj.name();
  }
}