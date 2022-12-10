package day05_Concatenation;

public class VariablePractice {
    public static void main(String[] args) {
        /*create a class called variablePractice and declare the following variables:
        num1 = 100;
        num2 = 10_000;
        num3 = 3.5;
        num4 = 2.5f;
        num5 = 999999999999l;
        num6 = 850_000;
        print each of the variable above(ustunde) on th console
         */
        //BIG MEMORY>>>LESS MEMORY
        //double->float->long-int->short-byte
        //2.5 is double byte if you want you can explicit, and write float num4=2.5f
       byte num1 = 100;
       short num2 = 10_000;
       double num3 = 3.5;
       float num4 = 2.5f;
       long num5 = 999_999_999_999l;
       int num6 = 850_000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    }
}
