package class9;

public class HW71 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.

        int [] numbers={45, 10, 2, 457, 24, 87};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[0]>numbers[1]&&numbers[0]>numbers[2]&&numbers[0]>numbers[3]&&numbers[0]>numbers[4]&&numbers[0]>numbers[5]){
                System.out.println("The largest number is "+numbers[0]);
                break;
            } else if (numbers[1]>numbers[0]&&numbers[1]>numbers[2]&&numbers[1]>numbers[3]&&numbers[1]>numbers[4]&&numbers[1]>numbers[5]) {
                System.out.println("The largest number is "+numbers[1]);
                break;
            } else if (numbers[2]>numbers[0]&&numbers[2]>numbers[1]&&numbers[2]>numbers[3]&&numbers[2]>numbers[4]&&numbers[2]>numbers[5]) {
                System.out.println("The largest number is "+numbers[2]);
                break;
            } else if (numbers[3]>numbers[0]&&numbers[3]>numbers[1]&&numbers[3]>numbers[2]&&numbers[3]>numbers[4]&&numbers[3]>numbers[5]) {
                System.out.println("The largest number is "+numbers[3]);
                break;
            } else if (numbers[4]>numbers[0]&&numbers[4]>numbers[1]&&numbers[4]>numbers[2]&&numbers[4]>numbers[3]&&numbers[4]>numbers[5]) {
                System.out.println("The largest number is "+numbers[4]);
                break;
            } else if (numbers[5]>numbers[0]&&numbers[5]>numbers[1]&&numbers[5]>numbers[2]&&numbers[5]>numbers[3]&&numbers[5]>numbers[4]) {
                System.out.println("The largest number is "+numbers[5]);
                break;
            }
        }
    }
}
