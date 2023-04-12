package class8;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter start number, end number and step");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();

        int counter=start;
        do{
            System.out.print(counter+" ");
            counter+=step;
        }while (counter<=end);

    }
}
