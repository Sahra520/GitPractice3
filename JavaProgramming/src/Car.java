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
        this(brand, model);
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
}



class CarObjects{
    public static void main(String[] args) {

        day32_Constructor.Car car1 = new day32_Constructor.Car("Toyota");
        day32_Constructor.Car car2 = new day32_Constructor.Car("Honda", "Accord");
        day32_Constructor.Car car3 = new day32_Constructor.Car("Lexus", "RX350", 2021);
        day32_Constructor.Car car4 = new day32_Constructor.Car("BMW", "X6", 2020, 50000);
        day32_Constructor.Car car5 = new day32_Constructor.Car("Tesla", "Model 3", 2019, 70000, "White");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}