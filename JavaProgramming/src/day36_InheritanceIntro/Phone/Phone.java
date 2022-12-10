package day36_InheritanceIntro.Phone;

public class Phone {

    public String brand, model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public void setInfo(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        hasBattery = true;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " calling");
    }


    public void text(long phoneNumber){
        System.out.println();
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()

1.2 Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()

1.3 Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()

1.4 Create a sub class of Phone named Nokia:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
selfDefense()
toString()

1.5 Create a class named Phone Objects and test of the
sub class' objects
2. Employee Task:
2.1 Create a class named Employee:
variables:
name, gender, age, id, jobTitle, salary
Methods:
setInfo()
work()
toString()

 */