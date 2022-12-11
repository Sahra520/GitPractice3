package day38_Inheritance.car;

public class Toyota extends Car{

    public Toyota(String brand, String model, String year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

}

/*
Toyota:
       extra methods:
             reliable()
 */