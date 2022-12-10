package day30_CustomClassIntro;

public class Car {

    /*
    car:
    Attributes: brand, model, color, year, price
    Actions: drive(), start(), stop(),...
    toString(); setInfo();

    car objects: create 3 objects of car
     */
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;
    //                        "BMW"            "X5"
    public void setInfo(String carBrand, String carModel,String carColor, int carYear, double carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void drive() {
        System.out.println("Driving "+ brand + " " + model);
    }

    public void start() {
        System.out.println(brand + " " + model + " has started.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", price= $" + price + '}';

    }
}




