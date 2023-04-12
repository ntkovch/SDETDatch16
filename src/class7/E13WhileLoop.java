package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter an integer number");
        int integer= scanner.nextInt();
        int num=1;
        while(num<=integer){
            System.out.print(num+" ");
            num++;
        }
    }
}
