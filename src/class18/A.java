package class18;

public class A {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    static void printF(){
        System.out.println("printF.............");
    }
}
class B extends A { }
class C extends B{
    public static void main(String[] args) {
        printF();
    }
}