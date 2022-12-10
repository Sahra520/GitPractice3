package day04_Variables;

public class Square {
    public static void main(String[] args) {
        /*create a class named Square, write a program that can calculate the area
        and perimeter of any given square.
         */
         /*side,area, perimeter
        area=side*side
        perimeter = 4*side
         */
        int side = 5;
        int area = side*side;
        int perimeter = 4 * side;
        System.out.println("side = " + side);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        System.out.println("*************************");

        double side1 = 3.5;
        double area1 = side1 * side1;
        double perimeter1 = 4 * side1;
        System.out.println("side1 = " + side1);
        System.out.println("perimeter1 = " + perimeter1);
        System.out.println("area1 = " + area1);
    }
}
