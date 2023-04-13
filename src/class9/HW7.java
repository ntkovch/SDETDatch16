package class9;

public class HW7 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int [] numbers={45, 10, 2, 457, 24, 87};
        int largNum=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largNum){
                largNum=numbers[i];
            }
        }
        System.out.println("The largest number is "+largNum);
    }
}
