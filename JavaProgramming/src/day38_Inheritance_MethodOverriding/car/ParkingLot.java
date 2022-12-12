package day38_Inheritance_MethodOverriding.car;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Camry", 2020, 20000, "Gray", 123456);
        //has relation with Toyota and ParkingLOt

        Tesla tesla1 = new Tesla("Model S", 2022,94990, "Red", 0);
        //has relation with ParkingLot and Tesla

        BMW bmw1 = new BMW("X5", 2020, 67350, "Black", 12000);
        //has relation with ParkingLot and BMW

        System.out.println(toyota1);
        toyota1.reliable();
        tesla1.start();//twist the key to Ignition
        toyota1.drive();

        System.out.println();

        System.out.println(tesla1);
        tesla1.autoPilot();
        tesla1.start();//say "Start"

        System.out.println();

        System.out.println(bmw1);
        bmw1.breaksDown();
        bmw1.racing();
        bmw1.drive();
        bmw1.start();//call mechanic; Jump start
    }
}
