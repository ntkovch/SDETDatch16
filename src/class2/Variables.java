package class2;

public class Variables {
    public static void main(String[] args) {
        String name="Nataliia";
        String lastName="Kovalchuk";
        char grade='A';
        String city="Ternopil";
        String country="Ukraine";
        String phoneNumber="+38-096-5876522";

        System.out.println("My name is "+name+" and my last name is "+lastName);
        System.out.println("I am "+grade+" student");
        System.out.println("I live in city "+city+" and country "+country);
        System.out.println("And my phone number is "+phoneNumber);
        city="London"; country="Great Britain"; phoneNumber="+44-568-21-33"; grade='B';
        System.out.println("My name is "+name+" and I moved to new city "+city+" and new country "+country+". My new phone number is "+phoneNumber);
        System.out.println("Now I am "+grade+" student");
    }
}
