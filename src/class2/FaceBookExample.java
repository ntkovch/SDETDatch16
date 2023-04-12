package class2;

import java.util.Scanner;

public class FaceBookExample {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan=scanner.nextBoolean();
        String result;
        if(loan){
            System.out.println("What is your credit score?");
            int score=scanner.nextInt();
            if(score<600){
                result="Not eligible";
            }else if(score>=600&&score<=700){
                result="Maybe eligible";
            }else if(score>=701&&score<=800){
                result="Eligible";
            }else{
                result="Difinitely eligible";
            }
        }else{
            result="Unknown";
        }
        System.out.println("The eligibility is "+result);



    }
}
