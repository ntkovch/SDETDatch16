package class7;

public class HWWhileLoop4 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int counter=20;
        while (counter<=50){
            if(counter%2!=0) {
                System.out.print(counter + " ");
            } counter++;
        }
        System.out.println();

        for (int i = 20; i <=50 ; i++) {
           if(i%2==1) {
               System.out.print(i+" ");

           }
        }
    }
}
