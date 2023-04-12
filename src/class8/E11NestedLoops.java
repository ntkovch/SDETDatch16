package class8;

public class E11NestedLoops {
    public static void main(String[] args) {

        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <11 ; i++) {
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

    }
}
