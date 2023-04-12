package class9;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        String [] sent=new String [7];
        Scanner scanner=new Scanner(System.in);
        int num=1;
        for(int i=0; i<7; i++){
            System.out.println("Please enter day "+num+" of the week");
            num++;
            sent [i]=scanner.next()
        }

        for(String days:sent){
            System.out.println(days);
        }
        }
    }

