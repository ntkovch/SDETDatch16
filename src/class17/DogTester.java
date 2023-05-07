package class17;

public class DogTester {
    public static void main(String[] args) {
        /*
        Dog obj1=new Dog();
        obj1.name="Boby";
        obj1.color="Black";
        obj1.breed="German";
        obj1.age=15;
        obj1.printInfo();

        Dog obj2=new Dog();
        obj2.name="Tami";
        obj2.color="White";
        obj2.breed="Labrador";
        obj2.age=6;
        obj2.printInfo();

        Dog obj3=new Dog();
        obj3.name="Ami";
        obj3.color="Brown";
        obj3.breed="Corso";
        obj3.age=11;
        obj3.printInfo();

        Dog obj4=new Dog();
        obj4.name="Lessy";
        obj4.color="Gold";
        obj4.breed="Belgian";
        obj4.age=9;
        obj4.printInfo();

        Dog obj5=new Dog();
        obj5.name="Ben";
        obj5.color="Gray";
        obj5.breed="Alaskan";
        obj5.age=4;
        obj5.printInfo();
         */

        Dog dog1=new Dog("Boby", "Black", "German",15);
        Dog dog2=new Dog("Tami", "White", "Labrador",6);
        Dog dog3=new Dog("Ami", "Brown", "Corso",11);
        Dog dog4=new Dog("Lessy", "Gold", "Belgian", 9);
        Dog dog5=new Dog("Ben", "Gray", "Alaskan",4);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();
    }

}
