package class11;

public class E2D2Array {
    public static void main(String[] args) {

        String [][] names={
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (String[] nameArr:names){
            for (String name:nameArr){
                System.out.println(name);
            }
        }

        /*for (String[] name : names) {
            for (String s : name) {
                System.out.print(s+" ");
            }
            System.out.println();
        }*/

    }
}
