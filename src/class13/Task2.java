package class13;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String sen="fggf3344KGFfg!@+_)fgJGF!!";


        sen=sen.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(sen.length());

    }
}
