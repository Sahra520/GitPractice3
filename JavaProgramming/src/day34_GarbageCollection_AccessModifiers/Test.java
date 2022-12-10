package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {
/*
        System.out.println(Circle.pi); //0.0
        System.out.println(Circle.name);//null
        System.out.println(Circle.numbers);//null
        //because we initialized into the main method

//main method it can not be executed by itself

*/

        System.out.println(Circle.pi); //3.14
        System.out.println(Circle.name);//Circle
        System.out.println(Circle.numbers);//[10,20,30]


        System.out.println("---------------");



        //find the sum of 10, 20
        System.out.println(sum(10, 20));//30


        //find the sum of 100, 200
        System.out.println(sum(100, 200));//300

        System.out.println(subtract(100, 50));//50

        System.out.println(multiplication(200, 30));//6000
    }
}
