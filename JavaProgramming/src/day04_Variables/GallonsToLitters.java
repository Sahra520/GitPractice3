package day04_Variables;

public class GallonsToLitters {
    public static void main(String[] args) {
        /*create a class named GallonsToLitters, write a program that can convert
        gallon(int) to litter(double)
        Hints: 1 gallon = 3.79 litters
         */

        int gallons = 10;
        double litters = gallons * 3.79;
        System.out.println("gallons = " + gallons);

        System.out.println("litters = " + litters);
    }
}
