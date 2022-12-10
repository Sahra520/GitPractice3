package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        declare the following variables:
        1 name
        2 buildingNumber
        3 streetName
        4 city
        5 state
        6 zipcode
        Shipping Address:
        Jimmy Joe
        7925 Jones Branch Dr
        McLean, VA 20125
         */
        String name = "Jimmy Joe",
               buildingNumber = "7925",
               streetName = "Jones Branch Dr",
               city = "McLean",
               state = "VA",
               zipCode = "20125";

        System.out.println("\t\t\t" + name + "\n\t\t\t" + buildingNumber
                + " " + streetName+ "\n\t\t\t" + city + "," + state + " " + zipCode);

        String address = name+"\n"+buildingNumber+" "+streetName+"\n"+city+
                ", "+state+" "+zipCode;
        System.out.println(address);
    }
}
