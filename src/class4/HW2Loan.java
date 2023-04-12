package class4;

import java.util.Scanner;

public class HW2Loan {
    public static void main(String[] args) {
        /*
        You are a loan specialist and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("What the amount of loan do you need?");
        int loan= scan.nextInt();
        if (loan<=200000){
            System.out.println("We will gladly lend you money.");
        }else {
            System.out.println("Unfortunately, we have to refuse you.");
        }
    }
}
