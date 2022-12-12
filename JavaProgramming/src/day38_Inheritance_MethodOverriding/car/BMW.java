package day38_Inheritance_MethodOverriding.car;

public class BMW extends Car {

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is a racing car");
    }


}
/*
BMW:
       extra methods:
             breaksDown()
             racing()
 */