package class14;

public class E5ArrayUtils {
    boolean contains(int[] arr, int num) {
        boolean res=false;
        for (int i : arr) {
            if (i == num) {
                 res=true;
                 break;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        E5ArrayUtils obj=new E5ArrayUtils();
        int [] arr={10,20,45};
        boolean result=obj.contains(arr,200);
        System.out.println(result);
    }
}
