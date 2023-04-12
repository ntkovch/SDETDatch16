package class6;

import java.util.Scanner;

public class HW8CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter first digit");
        int num1= scan.nextInt();
        System.out.println("Please Enter second digit");
        int num2= scan.nextInt();
        System.out.println("Please enter the arithmetic operator");
        char operator=scan.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }
}
