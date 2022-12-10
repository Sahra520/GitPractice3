package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int division = num1 / num2;
        int remainder = num1 % num2;
        //10 divide by 3 is equal to 3 with a remainder of 1
        System.out.println(num1+" divided by "+num2+" is equal to "+ division+" with a remainder of "+ remainder);

        /*do other tasks like this
        45%8
        100%15

          remainder = numerator - (denominator * result)
                        10     -    (  3     *    3  ) = 1
         10 % 3 = 1;
         45 / 8 = 5.625; in math
         45 - ( 8 * 5 ) = 5
         45 % 8 = 5

         */

    }
}
