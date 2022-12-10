package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;


    public static ArrayList<Integer> numbers = new ArrayList<>();//static method
    //gives error - numbers.add(10);

    static {
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }
/*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }

*/











    public Circle(double radius){
        this.radius = radius;
       // pi = 3.14; it is not best practice
    }

    static {
       // radius = 5; gives error, because radius is instance
                pi = 3.14;
                name = "Circle";
    }

     //public static Sheet sheet;


}
