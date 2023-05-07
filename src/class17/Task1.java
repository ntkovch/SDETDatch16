package class17;

public class Task1 {
    /*
    Write a java class that will have a constructor: one with parameters and second
    without any parameters. Create a separate Test class where you will execute both
    of the constructors 1 by 1.
     */
    int number;
    Task1(){
        System.out.println("no argument");
    }
    Task1(int num1){
        number=num1;
        System.out.println(number+" is an argument");
    }
}
