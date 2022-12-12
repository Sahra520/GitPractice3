package day38_Inheritance.car;

public class BMW extends Car {

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaks down every 100 miles");
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