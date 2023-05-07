package class18;

public class Audi extends  Car1 {

        }
        class CarTester{
                public static void main(String[] args) {
                        Audi car=new Audi();
                        car.sound();
                        car.go();
                        BMW bmw=new BMW();
                        bmw.sound();
                        bmw.go();
                        Honda honda=new Honda();
                        honda.sound();
                        honda.go();

                }
        }
