package class14;

public class Task1 {
    /*
    Create a method that will take 2 parameters as a numbers
    and prints which number is larger
     */
    int largNumber(int num1, int num2){
        int larg=0;
        if(num1>num2){
            larg=num1;
        } else if (num2>num1) {
            larg=num2;
        }
        return larg;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        System.out.println(obj.largNumber(34,50));
    }
}
