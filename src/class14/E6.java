package class14;

public class E6 {
    boolean isEven(int num){
        boolean found=false;
        if(num%2==0){
            found=true;
        }
        return found;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        boolean result=obj.isEven(16);
        System.out.println(result);
    }
}

