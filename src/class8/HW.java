package class8;

import java.util.Objects;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
       // Print numbers from 1 to 50 except those that are divisible by 3

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int grade=scanner.nextInt();
        char num;

        if(grade>=1 && grade<25){num='F';
        }
        else if(grade>=25&&grade<45){num='E';
        }
        else if(grade>=45&&grade<50){num='D';
        }
        else if(grade>=50&&grade<60){num='C';
        }
        else if(grade>=60&&grade<80){num='B';
        }
        else if(grade>=80){num='A';}


    }
}


