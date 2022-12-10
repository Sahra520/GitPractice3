package day37_Inheritance_SuperKeyword.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Grey");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("**************************");

         iphone.call(911);
         iphone.text(121342445);
         iphone.faceTime(35426676);
         iphone.faceTime("Cydeo@gmail.com");

        System.out.println("----------");

        samsung.call(254356);
        samsung.freeze();

        System.out.println("---------------");

        nokia.call(255);
        nokia.selfDefense();

        System.out.println(" ");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}
