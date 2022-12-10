package day32_Constructor;

public class Car {


    public String brand, model;
    public int year;
    public double price;
    public String color;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this(brand,model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, String color) {
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    /*
    instance variables:
    brand, model, year, price, color
    1st constructor: Initializes brand ONLY
    2nd constructor: Initializes brand and model
        (Must use constructor to call to set the brand)
    3rd constructor: Initializes brand, model year
        (Must use constructor to call to set the brand, model)
    4th constructor: Initializes brand model year price
        (Must use constructor to call to set the brand, model, year)
    5th constructor: Initializes all the instances
        (Must use constructor to call to set the brand, model, year, color)
    Instance methods: toString()





     */
}
