package class9;

public class HW1 {
    public static void main(String[] args) {
        /*Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).
         */

        char [] chars={'A', 'B', 'C', 'D'};
        System.out.println(chars[1]);

        char [] grad= new char[4];
        grad[0]='A';
        grad[1]='B';
        grad[2]='C';
        grad[3]='D';

        for (char i : grad) {
            if(i=='B'){
               System.out.println(i);
            }
           }

    }
}
