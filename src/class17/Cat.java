package class17;

public class Cat {
    String name;
    Cat(String catName){
        name=catName;
        System.out.println("1 argument constructor called");
    }
    Cat(String name, String color){

        System.out.println("2 argument constructor called");
    }
    Cat(){
        System.out.println("0 argument constructor called");
    }

    Cat(int age){
        System.out.println("int argument constructor called");
    }
    Cat(double weight){
        System.out.println("double argument constructor called");
    }
   //void printInfo(){
  //     System.out.println(name);
  // }
    public static void main(String[] args) {
       // String color;
        Cat cat=new Cat("Tanya","Black");
       // cat.printInfo();

    }
}
