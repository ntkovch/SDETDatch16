package class6;

import java.util.Scanner;

public class HW5Score {
    public static void main(String[] args) {
        /*
         3. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your quiz score");
        int quiz= scanner.nextInt();
        System.out.println("Please Enter your mid term score");
        int midTerm= scanner.nextInt();
        System.out.println("Please Enter your final score");
        int finalScore=scanner.nextInt();
        int avarageScore=(quiz+midTerm+finalScore)/3;

        if (avarageScore>=90){
            System.out.println("Your grade is A");
        } else if (avarageScore>=70&&avarageScore<90) {
            System.out.println("Your grade is B");
        } else if (avarageScore>=50&&avarageScore<70) {
            System.out.println("Your grade is C");
        }if (avarageScore<50){
            System.out.println("Your grade is F");
        }
    }
}
