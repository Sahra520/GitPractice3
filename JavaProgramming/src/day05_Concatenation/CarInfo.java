package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        /*
        1. Create a class called CarInfo.java
        2. Declare the following variables:
            1) year
            2) make
            3) model
            4) miles
            5) color
            6) price
        3.Use concatenation to print the full info of the car in the following format:
               Year Make Model, Miles, Color, Price
           Example:
           2018 Toyota Camry, 50000 miles, Red, $19000.
         */

        String year = "2022";
        String model = "TESLA Model Y Long Range";
        String basePrice= "$ 65990";
        String range="330 miles (EPA est.)";
        String seatingUpTo="7 seats";
        String drive="AWD Dual Motor";
        String topSpeed="135mph";

        System.out.println("\t"+year+" "+model+", "+basePrice+", "
                        +range+", "+seatingUpTo+", "+drive+", "+"Top Speed "+topSpeed);
    }
}
