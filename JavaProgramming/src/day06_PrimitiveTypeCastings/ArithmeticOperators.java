package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        +: Addition
        -: Subtraction
        *: Multiplication
        /: Division
        in math:
        10/4=2.5
           in java:
           10/4=2 because java gives you integer numbers
           to get 2.5
           10.0/4=2.5

           integer/integer=========> integer
           decimal/integer=========> decimal
           integer/decimal=========> decimal
           decimal/decimal=========> decimal
        %: Remainder
         */

        System.out.println(10+20); //addition 30
        System.out.println("12"+1);//121 concatenation
        System.out.println(100-50);//50 subtraction
        System.out.println(10*6);//60, multiplication
        System.out.println(100/3);//33 division
        System.out.println(100.0/3);//33.333333333336
        System.out.println(10/4);//2
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.
        System.out.println(10d/4);//2.5
        System.out.println(10/4d);//2.5

        System.out.println();
        int a =100;
        double b =a/6;//16.0
        System.out.println(b);

        double c =a/6.0;//16.66666
        System.out.println(c);

        double m = a/6d;//16.66666
        System.out.println(m);

        double l=(double) a/6;//16.66666
        System.out.println(l);

        System.out.println(100d);//100.0



         }
}
