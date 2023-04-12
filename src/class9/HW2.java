package class9;

public class HW2 {
    public static void main(String[] args) {
        /*Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String [] names={"Aiya", "Kara", "Alamir", "Nataliia", "Boris", "Burak", "Alamir", "Aydin"};
        System.out.println(names[3]);

        String [] nam=new String [8];
        nam[0]="Aiya";
        nam[1]="Kara";
        nam[2]="Alamir";
        nam[3]="Nataliia";
        nam[4]="Boris";
        nam[5]="Burak";
        nam[6]="Alamir";
        nam[7]="Aydin";
        System.out.println(nam[3]);


    }
}
