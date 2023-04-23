package class11;

public class E7D2Array {
    public static void main(String[] args) {
        boolean [][] arr={
                {true,false,true,true,false},
                {true,false,false,false,false}

        };
        int counter=0;
        for (boolean[] booleans : arr) {
            for (boolean aBoolean : booleans) {
                if(aBoolean){
                    counter++;
                }
            }
        }
        System.out.println("counter = " + counter);
        }
    }
