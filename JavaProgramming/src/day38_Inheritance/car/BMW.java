package day38_Inheritance.car;

public class BMW extends Car{

    public BMW(String brand, String model, String year, double price, String color, double miles) {
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
  2. BMW:
       extra methods:
             breaksDown()
             racing()
 */