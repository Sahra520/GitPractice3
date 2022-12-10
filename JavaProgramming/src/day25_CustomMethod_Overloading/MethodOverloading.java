package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        /*Method Overloading: multiple different methods sharing the same method name
                //same method name, different parameters

                return type. access modifiers and specifiers

                ADVANTAGE:
                1. easy to memorize
                2. easy to read
                3. reusable
                4. flexible
        */

        int[] intArray = {1,34,23,123,-44,89};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));//[-44, 1, 23, 34, 89, 123]

        double[] doubleArray = {12.3, 32.32, 67.88, 3.3, 46.45};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));//[3.3, 12.3, 32.32, 46.45, 67.88]

        char[] charArray = {'E', 'G', 'A', 'D', 'M', 'K'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));//[A, D, E, G, K, M]



        System.out.println("--------------------------------------");


        int sum1=sumOfNumbers(12,24,5464,45);//or
        System.out.println(sumOfNumbers(12,24,5464,45));//5545


        int sum2 = sumOfNumbers(2134,454);//or
        System.out.println(sumOfNumbers(2134,454));//2588


        double sum3=sumOfNumbers(2.67,56.5,67.98);//or
        System.out.println(sumOfNumbers(2.67,56.5,67.98));//127.15


        double sum4 = sumOfNumbers(23,5,65,566,88);//or
        System.out.println(sumOfNumbers(23,5,65,566,88));//747.0


        double sum5 = sumOfNumbers(213.3,342.4,32.3,34.3,342.5);//or
        System.out.println(sumOfNumbers(213.3,342.4,32.3,34.3,342.5));//964.8

    }

    public static int sumOfNumbers(int num1, int num2){ return num1+num2;}

    public static int sumOfNumbers(int num1, int num2, int num3){ return num1+num2+num3;}

    public static double sumOfNumbers(double num1, double num2, double num3){return num1+num2+num3;}

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){ return num1+num2+num3+num4;}


    public static double sumOfNumbers(double num1, double num2, double num3, double num4, double num5){
        return num1+num2+num3+num4+num5;
    }


    public static double sumOfNumbers(int num1, int num2, int num3, int num4, int num5, int num6) {
        return sumOfNumbers(num1, num2, num3, num4, num5 ) + num6;
    }
}
