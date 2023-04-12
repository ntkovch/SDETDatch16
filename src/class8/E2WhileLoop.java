package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num= scanner.nextInt();
        while(num!=-1){
            System.out.println("Try again");
            System.out.println("Please Enter a number");
            num= scanner.nextInt();
        }

        /*do {
           System.out.println("Try again");
           System.out.println("Please enter a number");
           int num= scanner.nextInt();
       }while (num!=-1)
*/
    }
}
