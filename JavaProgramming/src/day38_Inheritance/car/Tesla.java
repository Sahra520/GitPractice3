package day38_Inheritance.car;

public class Tesla extends Car{

    public Tesla(String brand, String model, String year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has auto pilot");
    }


}
/*
Tesla:
       extra methods:
             autoPilot()
 */