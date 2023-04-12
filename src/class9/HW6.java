package class9;

public class HW6 {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array
        int sum=0;
        int [] numbers={21, 44, 10, 64, 11};


        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
