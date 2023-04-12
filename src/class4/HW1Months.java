package class4;

public class HW1Months {
    public static void main(String[] args) {
        /*
        Create a Java program and declare int variable that will hold a month.
        Based on the value of the variable your program should print the name of the month.
         */
        int currentMonth=13;

        if (currentMonth==1){
            System.out.println("January");
        }else if (currentMonth==2){
            System.out.println("February");
        } else if (currentMonth==3) {
            System.out.println("March");
        } else if (currentMonth==4) {
            System.out.println("April");
        } else if (currentMonth==5) {
            System.out.println("May");
        } else if (currentMonth==6) {
            System.out.println("June");
        } else if (currentMonth==7) {
            System.out.println("July");
        } else if (currentMonth==8) {
            System.out.println("August");
        } else if (currentMonth==9) {
            System.out.println("September");
        } else if (currentMonth==10) {
            System.out.println("October");
        } else if (currentMonth==11) {
            System.out.println("November");
        } else if (currentMonth==12) {
            System.out.println("December");
        }else {
            System.out.println("Wrong month number");
        }
    }
}
