package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber= scan.next();

        scan.nextLine();
        System.out.println("Enter your street name:");
        String streetName=scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();

        System.out.println("Enter your state:");
        String state=scan.next();

        System.out.println("Enter your zip code:");
        String zipCode=scan.next();

        scan.nextLine();
        System.out.println("Enter your country name: ");
        String country=scan.nextLine();

        System.out.println("\tName: "+fullName+"\n\tBuilding number: "
                +buildingNumber+"\n\tStreet name: " +streetName
                +"\n\tCity name: "+cityName+"\n\tState: "+state
                +"\n\tZip code:"+zipCode+"\n\t"+country);


        scan.close();

    }
}
/*
1. Enter your full name: ( nextLine() )
2. Enter your building number: ( next() )
3. Enter your Street name: ( nextLine() )
4. Enter your city name: ( nextLine() )
5. Enter your state: ( next() )
6. Enter zip code: ( next() )

Display the shipping code:
 */