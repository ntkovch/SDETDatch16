package class15;

import java.util.Arrays;

public class E1 {
    int [] createArr(int size){
        int [] arr=new int [size];
        for (int i = 0; i < size; i++) {
           arr[i]=10;
        }

        return arr;
    }

    public static void main(String[] args) {
        E1 obj=new E1();
        for (int i : obj.createArr(5)) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.print(Arrays.toString(obj.createArr(5)));
    }
}
