class Employee {
  String name;
  int id;
  Double salary;

  Employee(String name, int id, Double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }
  void incSalary(Double percentage){
    salary += salary * percentage / 100;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Salary: " + salary);
  }
}
public class oopTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee("John", 1, 50000.00);
    emp1.incSalary(20.0);
    Employee emp2 = new Employee("Jane", 2, 60000.00);
    emp1.display();
    emp2.display();
  }
}
