package day38_Inheritance_MethodOverriding.car;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has autopilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + brand + " " + model);
    }
}
/*
 Tesla:
       extra methods:
             autoPilot()
 */