package class9;

import java.net.Socket;

public class HW3 {
    public static void main(String[] args) {
        /*Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array:
        “Saturday is Java coding day”.
         */
        String [] words={"Java", "Saturday", "day", "coding", "is"};
        System.out.print(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

    }
}
