package class11;

public class E6D2Array {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                }
            System.out.println(sum);
            sum=0;
            }

        }


    }
