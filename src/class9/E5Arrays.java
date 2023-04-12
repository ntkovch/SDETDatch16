package class9;

public class E5Arrays {
    public static void main(String[] args) {

        String [] names={"Jony", "Nelly", "Jacey", "Tony", "Bob"};
        for (int i = 0; i <names.length; i++) {

            System.out.print(names[i]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
