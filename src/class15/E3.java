package class15;

import java.util.Arrays;

public class E3 {
    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        E3 obj=new E3();
        int [] arr={10,10,40};
        System.out.println(obj.sumArr(arr));
    }
}
