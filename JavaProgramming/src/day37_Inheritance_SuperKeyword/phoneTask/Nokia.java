package day37_Inheritance_SuperKeyword.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }


    public void selfDefense(){
        System.out.println("You can use " + brand + " " + model + " as defense tool");
    }
}




/*
1.4 Create a subclass of Phone named Nokia:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
selfDefense()
toString()
 */