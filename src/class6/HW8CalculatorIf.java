package class6;

import java.util.Scanner;

public class HW8CalculatorIf {
    public static void main(String[] args) {
        /*
        Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
        Please complete this assignment in 2 ways: using if statement and switch case.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter first digit");
        int num1= scan.nextInt();
        System.out.println("Please Enter second digit");
        int num2= scan.nextInt();
        System.out.println("Please enter the arithmetic operator");
        char operator=scan.next().charAt(0);

        if(operator=='+'){
            System.out.println(num1+num2);
        }if (operator=='-'){
            System.out.println(num1-num2);
        }if (operator=='*'){
            System.out.println(num1*num2);
        }if (operator=='/'){
            System.out.println(num1/num2);
        }
    }
}
