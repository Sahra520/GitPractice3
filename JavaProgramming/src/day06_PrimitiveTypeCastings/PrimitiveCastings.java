package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        /*primitives: double > float > long > int > short > byte
        smaller primitive can be directly assigned to larger primitive type
         */
        /*
        Implicit Casting
        Casting smaller primitive types to larger primitive types
        Implicitly done by the compiler*/
        byte a = 100;
        //short b = (short)a;
        short b = a;

        int c = b;//implicit casting
      //  int c = (int)b;

        long d = c;
        //(long)c

        float e = d;
        double f= e;

        System.out.println("----------------------------------------------");


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
        int x = 55;
        short y = (short) x;
        System.out.println(x+":"+y);

        long j = 1_000_000;
        short k = (short)j;
        System.out.println(j+":"+k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+":"+m);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n+":"+s); //10
        System.out.println("");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+":"+s1);

        System.out.println();

        float f1 = 30.5f;
        long l1 = (long)f1;
        System.out.println(f1+":"+l1);
    }
}
