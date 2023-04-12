package class6;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class HW7Grade {
    public static void main(String[] args) {
        // Allow user to enter grade (A, B, or C etc...) and then provide explanation:
        // A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        // At the end your program should print which grade was entered by a user with explanation.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your grade (A, B, C, D, other)");
        char grade=scan.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Your grade is A-Excellent");
                break;
            case 'B':
                System.out.println("Your grade is B-Good");
                break;
            case 'C':
                System.out.println("Your grade is C-Avarage");
                break;
            case 'D':
                System.out.println("Your grade is D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
