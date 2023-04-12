package class9;

public class HW4 {
    public static void main(String[] args) {
        /*Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */
        String [] cars={"Volkswagen", "Ford", "Audi", "Toyota", "Mercedes-Benz", "BMW"};
        for (int i = 0; i < 6; i++) {
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        for (String car : cars) {
            System.out.print(car+" ");
        }

    }
}
