package day37_Inheritance_SuperKeyword.phoneTask;

public class Iphone extends Phone {

    // we deleted here String brand because we initialized this static in super keyword for all Iphone class
    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having a Face Time with phone number" + phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(brand +" " + model + " is having a Face Time with email" + email);
    }



}
/*
1.2 Create a subclass of Phone named IPhone:
Variables:
brand, model, size, price,color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
 */