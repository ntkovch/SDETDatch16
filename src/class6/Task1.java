package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your height in inches");
        int height=scan.nextInt();
        if(height<60){
            System.out.println("You are short");
        } else if (height<=72 && height>=60) {
            System.out.println("You are medium ");

        } else {
            System.out.println("You are tall");
        }
    }
}
