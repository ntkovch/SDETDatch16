package class18;

public class Person {
    String name;
void sleep(){
    System.out.println("ZZZzzzzZZZZZz.........");
}
}
class Employee extends Person{

}
class Tester extends Employee{

}
class PersonTester{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.sleep();
        Tester tester=new Tester();
        tester.name="Sarah";
        tester.sleep();
    }
}