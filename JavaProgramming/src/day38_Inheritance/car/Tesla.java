package day38_Inheritance.car;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has autopilot");
    }
}
/*
 Tesla:
       extra methods:
             autoPilot()
 */