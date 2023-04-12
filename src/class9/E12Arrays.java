package class9;

public class E12Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[5];
       /*numbers[2]=50;
        numbers[0]=100;
        numbers[1]=80;
        numbers[3]=24;
        numbers[4]=875;*/
        int num=50;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=num;
            num+=10;
        }

        for(int number: numbers){
            System.out.println(number);
        }
    }
}
