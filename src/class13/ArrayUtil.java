package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 = {120, 302, 5, 889};

        int number = 89;
        int number1 = 12;
        int number2 =5;
        ArrayUtil spr=new ArrayUtil();
        spr.searchArray(arr,number);
        spr.searchArray(arr1,number1);
        spr.searchArray(arr2,number2);
            }
            void searchArray(int [] arr,int number){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                System.out.println("Yes");
                break;
            }
        }
    }
}


