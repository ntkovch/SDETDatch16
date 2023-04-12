package class4;

import java.util.Scanner;

public class HW3DMV {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age= scan.nextInt();
        if (age>=18){
            System.out.println("We will issue a driver license to you");
        }else {
            System.out.println("We offer you to get a learners permit");
        }
    }
}
