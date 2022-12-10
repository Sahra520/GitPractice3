package day37_Inheritance_SuperKeyword.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
// if we are sure about hasBattery=true we do not need static block, we can assign it when wee declare it

  public void call(long phoneNumber){
      System.out.println(brand + " " + model + " is calling " + phoneNumber);
  }


  public void text(long phoneNumber){
      System.out.println(brand + " " + model + " is texting " + phoneNumber);
  }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
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





1.5 Create a class named Phone Objects and test of the
subclass' objects
2. Employee Task:
2.1 Create a class named Employee:
variables:
name, gender, age, id, jobTitle, salary
Methods:
setInfo()
work()
toString()

 */