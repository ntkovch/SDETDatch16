package class15;

public class Dog {
    String name;

    String color;
    int age;
    static double weight;

    public static void main(String[] args) {
        Dog dog=new Dog();
        Dog.weight=1.15;
        dog.color="green";
        Dog dog1=new Dog();
        System.out.println(dog1.color);
    }
}
