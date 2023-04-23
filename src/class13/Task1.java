package class13;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */

        String sent="   What’s the weather like? What awful weather! The weather is terrible today.";
        System.out.println(sent.replace(" ",""));

        /* String [] strArr=sent.split("[.!?]");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i].trim());*/
        }
    }

