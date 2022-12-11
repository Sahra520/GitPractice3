package day38_Inheritance.car;

public class BMW extends Car {

    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaks down");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }
}
/*
BMW:
       extra methods:
             breaksDown()
             racing()
 */