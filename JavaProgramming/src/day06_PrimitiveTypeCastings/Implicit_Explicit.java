package day06_PrimitiveTypeCastings;

public class Implicit_Explicit {
    public static void main(String[] args) {
        /*
        Implicit Casting
        Casting smaller primitive types to larger primitive types
        Implicitly done by the compiler

        Ex:
        byte a = 25;              short x = 1000;
        int b = a;                long y = (long)x;
         */
         /*Explicit Casting
        * Casting larger primitive types to smaller primitive types
        * Must be done explicitly

        Ex:
        * int a = 100;                           long x = 2000;
        * byte b = (byte)a;                      short y = (short) x;
         */
        /*primitives: double > float > long > int > short > byte
        larger primitives CAN NOT directly assigned to larger primitive type
        (need to be casted manually)
         */
    }
}
