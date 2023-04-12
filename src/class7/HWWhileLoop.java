package class7;

public class HWWhileLoop {
    public static void main(String[] args) {
        //Print numbers from 1 to 100 in 1 line with space
        int counter=1;
        while (counter<=100){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();

        for (int i =1 ; i <=100 ; i++) {
            System.out.print(i+" ");
        }
    }
}
