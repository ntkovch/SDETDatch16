package class14;

public class E4ArrayUtils {
    int add(int num1, int num2) {
        int sum=num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();
        int result= obj.add(5,8);
        System.out.println(result);
        System.out.println(obj.add(5,8));
    }

}
