package class4;

import java.util.Scanner;

public class HW4CityTem {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is
        the city __ is __”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your city");
        String city= scan.nextLine();
        System.out.println("Please Enter the temperature in your city (Fahrenheit)");
        int temp= scan.nextInt();
        temp=(temp-32)*5/9;
        System.out.println("The temperature in "+city+" is "+temp+" degree Celsius");


    }
}
