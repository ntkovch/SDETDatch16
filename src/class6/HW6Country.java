package class6;

import java.util.Scanner;

public class HW6Country {
    public static void main(String[] args) {
        //Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your country");
        String country= scanner.next();

        switch (country){
            case "USA":
            case "Canada":
            case "Australia":
                System.out.println("You speak English");
                break;
            case "Ukraine":
                System.out.println("You speak Ukrainian");
                break;
            case "Spain":
                System.out.println("You speak Spanish");
                break;
            case "Poland":
                System.out.println("You speak Polish");
                break;
            default:
                System.out.println("wrong country");
                break;
        }

    }
}
